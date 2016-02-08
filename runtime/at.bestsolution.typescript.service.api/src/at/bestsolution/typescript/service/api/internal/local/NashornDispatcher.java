package at.bestsolution.typescript.service.api.internal.local;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.google.gson.JsonObject;

public class NashornDispatcher extends JSONDispatcher {

	private final Invocable inv;
	private final Object dispatcher;

	public NashornDispatcher() {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");
		this.inv = (Invocable) engine;

		FileSlurp value = new FileSlurp();
		Bindings bindings = engine.createBindings();
		bindings.put("slurper", value);
		bindings.put("stderr", System.err);
		engine.setBindings(bindings, ScriptContext.GLOBAL_SCOPE);

		// "/usr/local/lib/node_modules/typescript/lib/typescriptServices.js"
		try {
			engine.eval(FileSlurp.getContent(getClass().getClassLoader().getResource("node/libs/typescriptServices.js")));
//			engine.eval("var console = { log : function() { stderr.println(arguments[0]) } };");
			engine.eval("var console = { log : function() { } };");

			engine.eval(FileSlurp.getContent(getClass().getClassLoader().getResource("node/src/languageService.js")));
			engine.eval(" function readFileContents ( filename ) { return slurper.read(filename); } ");

			this.dispatcher = engine.eval("new TypeScriptServiceAPI.ServiceDispatcher()");
		} catch (ScriptException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected CompletableFuture<JsonObject> sendRequest(String request) {
		return CompletableFuture.supplyAsync(() -> {
			try {
//				System.err.println("Sending: " + request);
//				System.err.println(dispatcher);
				String rv  = (String) inv.invokeMethod(dispatcher, "invokeMethod", request );
//				System.err.println("Received: " + rv);
				com.google.gson.JsonParser p = new com.google.gson.JsonParser();
				com.google.gson.JsonObject root = (com.google.gson.JsonObject) p.parse(rv);
				if( root.has("error") ) {
					throw new RuntimeException(root.get("error").getAsString());
				}
				return  root;
			} catch (ScriptException | NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		});
	}

}
