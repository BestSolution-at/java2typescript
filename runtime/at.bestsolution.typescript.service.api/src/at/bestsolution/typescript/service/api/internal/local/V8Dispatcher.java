package at.bestsolution.typescript.service.api.internal.local;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.google.gson.JsonObject;

public class V8Dispatcher extends JSONDispatcher {
	private final V8Object dispatcher;
	private final V8 runtime;

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
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected CompletableFuture<JsonObject> sendRequest(String request) {
		V8Array param = null;
		try {
			param = new V8Array(runtime).push(request);
			String rv = dispatcher.executeStringFunction("invokeMethod", param);
			com.google.gson.JsonParser p = new com.google.gson.JsonParser();
			com.google.gson.JsonObject root = (com.google.gson.JsonObject) p.parse(rv);
			if( root.has("error") ) {
				throw new RuntimeException(root.get("error").getAsString());
			}
			return  CompletableFuture.completedFuture(root);
		} finally {
			if( param != null ) {
				param.release();
			}
		}
	}

}
