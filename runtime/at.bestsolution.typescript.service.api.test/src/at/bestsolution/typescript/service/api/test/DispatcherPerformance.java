package at.bestsolution.typescript.service.api.test;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;

import at.bestsolution.typescript.service.api.internal.local.NashornDispatcher;
import at.bestsolution.typescript.service.api.internal.local.V8Dispatcher;
import at.bestsolution.typescript.service.api.pojo.model.NavigationBarItemPojo;
import at.bestsolution.typescript.service.api.services.Dispatcher;

public class DispatcherPerformance {
	public static void main(String[] args) {
		try {
			System.err.println("V8");
			System.err.println("============");
			executeTests(timeit("Boostrap", () -> new V8Dispatcher()));
			System.err.println();
			System.err.println("Nashorn");
			System.err.println("============");
			executeTests(timeit("Nashorn", () -> new NashornDispatcher()));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void executeTests(Dispatcher dispatcher) throws Exception {
		timeit("Project", () -> dispatcher.sendSingleValueRequest("LanguageService", "createProject", String.class, "MyProject").get());
		timeit("File", () -> dispatcher.sendSingleValueRequest("LanguageService", "addFile", String.class, "p_0", DispatcherPerformance.class.getResource("sample.ts")).get());
		timeit("File", () -> dispatcher.sendSingleValueRequest("LanguageService", "addFile", String.class, "p_0", DispatcherPerformance.class.getResource("sample2.ts")).get());
		timeit("Outline", () -> dispatcher.sendMultiValueRequest("LanguageService", "getNavigationBarItems", NavigationBarItemPojo.class, "p_0", "f_0").get());
		timeit("Outline", () -> dispatcher.sendMultiValueRequest("LanguageService", "getNavigationBarItems", NavigationBarItemPojo.class, "p_0", "f_1").get());
	}

	public static void timeit(String task, Runnable r) {
		long t = System.currentTimeMillis();
		r.run();
		long t2 = System.currentTimeMillis();
		System.err.println( task + " : " + (t2-t));
	}

	interface ExSupplier<T> {
		public T get() throws Exception;
	}
	private static <T> T timeit(String task, ExSupplier<T> r) throws Exception {
		long t = System.currentTimeMillis();
		T rv = r.get();
		long t2 = System.currentTimeMillis();
		System.err.println( task + " : " + (t2-t));
		return rv;
	}

	private static String callMethod(V8 runtime, V8Object o, String parameter) {
		V8Array param = null;
		try {
			param = new V8Array(runtime).push(parameter);
			return o.executeStringFunction("invokeMethod", param);
		} finally {
			param.release();
		}
	}
}
