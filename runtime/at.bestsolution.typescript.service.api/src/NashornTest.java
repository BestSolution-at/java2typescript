import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.google.gson.Gson;

public class NashornTest {
	public static void main(String[] args) {
		System.err.println(new Gson().toJson(new Object[] { 1 , "Test" }));
	}

	private void bla() {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");
//		ScriptEngine engine = new jdk.nashorn.api.scripting.NashornScriptEngineFactory().getScriptEngine(new String[] {"-ot=true"});

		try {
			Bindings bindings = engine.createBindings();
			bindings.put("slurper", new FileSlurp());
			engine.setBindings(bindings, ScriptContext.GLOBAL_SCOPE);

			engine.eval(new FileReader("/usr/local/lib/node_modules/typescript/lib/typescriptServices.js"));
			engine.eval("var console = { log : function() {} };");

//			engine.eval("function require(type) { if(type == \"os\")  { return { EOL : \"\\n\" } } else { return { readFileSync : function(filename) { return slurper.read(filename); } } } }");
			engine.eval(new FileReader("/Users/tomschindl/git/tsservice/runtime/at.bestsolution.typescript.service.api/node/src/languageService.js"));
			engine.eval(" function readFileContents ( filename ) { return slurper.read(filename); } ");

			Invocable inv = (Invocable) engine;

			Object o = engine.eval("new TypeScriptServiceAPI.ServiceDispatcher()");
			System.err.println(inv.invokeMethod(o, "invokeMethod", "{ \"requestId\" : 1, \"service\" : \"languageService\", \"method\" : \"createProject\", \"parameters\" : [ \"MyProject\" ] }"));
			System.err.println(inv.invokeMethod(o, "invokeMethod", "{ \"requestId\" : 2, \"service\" : \"languageService\", \"method\" : \"addFile\", \"parameters\" : [ \"p_0\", \"/Users/tomschindl/git/tsservice/runtime/at.bestsolution.typescript.service.api/ts-sample/sample.ts\" ] }"));
			System.err.println(inv.invokeMethod(o, "invokeMethod", "{ \"requestId\" : 3, \"service\" : \"languageService\", \"method\" : \"addFile\", \"parameters\" : [ \"p_0\", \"/Users/tomschindl/git/tsservice/runtime/at.bestsolution.typescript.service.api/ts-sample/sample2.ts\" ] }"));
			long t = System.nanoTime();
			System.err.println(inv.invokeMethod(o, "invokeMethod", "{ \"requestId\" : 4, \"service\" : \"languageService\", \"method\" : \"getNavigationBarItems\", \"parameters\" : [ \"p_0\", \"f_0\" ] }" ));
			long t2 = System.nanoTime();
			System.err.println("Took: " + (t2-t));
			long t3 = System.nanoTime();
			System.err.println(inv.invokeMethod(o, "invokeMethod", "{ \"requestId\" : 5, \"service\" : \"languageService\", \"method\" : \"getNavigationBarItems\", \"parameters\" : [ \"p_0\", \"f_1\" ] }" ));
			System.err.println("Took: " + (t3-t2));

//			System.err.println(o.callMember("invokeMethod", "{ \"requestId\" : 1, \"service\" : \"languageService\", \"method\" : \"createProject\", \"parameters\" : [ \"MyProject\" ] }"));

//			System.err.println(f.apply("{ \"requestId\" : 1, \"service\" : \"languageService\", \"method\" : \"createProject\", \"parameters\" : [ \"MyProject\" ] }"));
//
//			engine.eval("var w = new TypeScriptServiceAPI.LanguageServiceWrapper();");
//			engine.eval("w.createProject( \"MyProject\" );");
//			engine.eval("w.addFile( \"p_0\", \"/Users/tomschindl/git/tsservice/runtime/at.bestsolution.typescript.service.api/ts-sample/sample.ts\" );");
//			engine.eval("w.addFile( \"p_0\", \"/Users/tomschindl/git/tsservice/runtime/at.bestsolution.typescript.service.api/ts-sample/sample2.ts\" );");
//			System.err.println("REQUEST NAVBAR");
//			long t = System.nanoTime();
//			System.err.println(engine.eval("JSON.stringify(w.getNavigationBarItems( \"p_0\", \"f_0\" ))"));
//			long t2 = System.nanoTime();
//			System.err.println("Took: " + (t2-t));
//			long t3 = System.nanoTime();
//			System.err.println(engine.eval("JSON.stringify(w.getNavigationBarItems( \"p_0\", \"f_1\" ))"));
//			System.err.println("Took: " + (t3-t2));
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static class FileSlurp {
		public String read(String filename) throws IOException {
			FileInputStream in = new FileInputStream(new File(filename));
			byte[] buf = new byte[1024];
			int l = 0;
			StringBuilder b = new StringBuilder();
			while( (l = in.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));
			}
			in.close();
			return b.toString();
		}
	}
}
