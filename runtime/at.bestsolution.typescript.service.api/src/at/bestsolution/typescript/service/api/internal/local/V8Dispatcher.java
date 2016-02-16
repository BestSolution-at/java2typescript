package at.bestsolution.typescript.service.api.internal.local;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.utils.V8Map;
import com.google.gson.JsonObject;

public class V8Dispatcher extends JSONDispatcher {
	private final V8Object dispatcher;
	private final V8 runtime;
	private static final boolean DISPATCHER_DEBUG = Boolean.getBoolean("dispatcher.debug");

	public V8Dispatcher() {
		try {
			FileSlurp value = new FileSlurp();
			runtime = V8.createV8Runtime();
			runtime.executeVoidScript(FileSlurp.getContent(getClass().getClassLoader().getResource("node/libs/typescriptServices.js")));
			runtime.executeVoidScript("var console = { log : function() {} };");
			runtime.executeVoidScript(FileSlurp.getContent(getClass().getClassLoader().getResource("node/src/languageService.js")));
			runtime.registerJavaMethod(new JavaCallback() {

				@Override
				public Object invoke(V8Object arg0, V8Array arg1) {
					try {
						return value.read(arg1.getString(0));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return null;
					}
				}
			}, "slurper");
			runtime.executeVoidScript(" function readFileContents ( filename ) { return slurper(filename); } ");
			dispatcher = (V8Object) runtime.executeScript("new TypeScriptServiceAPI.ServiceDispatcher()");
			runtime.getLocker().release();
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	public <T> T runInLock(Function<V8,T> function) {
		try {
			runtime.getLocker().acquire();
			return function.apply(runtime);
		} finally {
			runtime.getLocker().release();
		}
	}

	public <P,T> T runInLock(P parameter, BiFunction<V8,P,T> function) {
		try {
			runtime.getLocker().acquire();
			return function.apply(runtime, parameter);
		} finally {
			runtime.getLocker().acquire();
		}
	}

	public <R> R runWithManager( BiFunction<V8, V8ObjectManager, R> function ) {
		V8ObjectManager mgr = new V8ObjectManager(runtime);
		try {
			return function.apply(runtime, mgr);
		} finally {
			mgr.release();
		}
	}

	private static class V8ObjectManager implements Releasable {
		private final V8 v8;
		private final List<Releasable> list = new ArrayList<>();

		public V8ObjectManager(V8 v8) {
			this.v8 = v8;
		}

		@Override
		public void release() {
			for( Releasable r : list ) {
				try {
					r.release();
				} catch( Throwable t ) {
					// proceed releasing
				}
			}
			this.list.clear();
		}

		private <O extends V8Value> O register( O o ) {
			list.add(o);
			return o;
		}

		public <O extends V8Value> O createManaged( Class<O> c ) {
			if( c == V8Array.class ) {
				return (O) register(new V8Array(v8));
			} else if( c == V8Object.class ) {
				return (O) register(new V8Object(v8));
			}
			try {
				return register(c.getConstructor(V8.class).newInstance(v8));
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private String jsRequest( V8 v8, V8ObjectManager mgr, String request ) {
		V8Array param = mgr.createManaged(V8Array.class).push(request);
		return dispatcher.executeStringFunction("invokeMethod", param);
	}

	@Override
	protected CompletableFuture<JsonObject> sendRequest(String request) {
		if( DISPATCHER_DEBUG ) {
			System.err.println("Request: " + request);
		}

		return CompletableFuture.supplyAsync(() -> {
			String rv = runInLock((runtime) -> {
				return runWithManager( (v8,mgr) -> jsRequest(v8, mgr, request));
			});

			com.google.gson.JsonParser p = new com.google.gson.JsonParser();
			com.google.gson.JsonObject root = (com.google.gson.JsonObject) p.parse(rv);
			if( DISPATCHER_DEBUG ) {
				System.err.println("Response: " + rv);
			}

			if( root.has("error") ) {
				throw new RuntimeException(root.get("error").getAsString());
			}
			return root;
		});
	}
}