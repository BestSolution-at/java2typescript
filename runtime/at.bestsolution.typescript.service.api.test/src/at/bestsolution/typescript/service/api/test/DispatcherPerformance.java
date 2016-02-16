package at.bestsolution.typescript.service.api.test;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import at.bestsolution.typescript.service.api.internal.local.FileSlurp;
import at.bestsolution.typescript.service.api.internal.local.NashornDispatcher;
import at.bestsolution.typescript.service.api.internal.local.V8Dispatcher;
import at.bestsolution.typescript.service.api.pojo.model.NavigationBarItemPojo;
import at.bestsolution.typescript.service.api.services.Dispatcher;

public class DispatcherPerformance {
	public static void main(String[] args) {
		try {
			List<String> files = new ArrayList<String>();
			String content = FileSlurp.getContent(DispatcherPerformance.class.getResource("big.ts"));

			for( int i = 0; i < 10; i++ ) {
				Path path = Files.createTempFile("sample", ".ts");
				OutputStream newOutputStream = Files.newOutputStream(path);
				newOutputStream.write(content.getBytes());
				newOutputStream.close();
				files.add(path.toAbsolutePath().toString());
			}
			System.err.println(files);

			System.err.println("V8");
			System.err.println("============");
			executeTests(timeit("Boostrap", () -> new V8Dispatcher()),files);
			System.err.println();
			System.err.println("Nashorn");
			System.err.println("============");
			executeTests(timeit("Nashorn", () -> new NashornDispatcher()),files);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void executeTests(Dispatcher dispatcher, List<String> files) throws Exception {
		timeit("Project", () -> dispatcher.sendSingleValueRequest("LanguageService", "createProject", String.class, "MyProject").get());

		for( String f : files ) {
			timeit("File", () -> dispatcher.sendSingleValueRequest("LanguageService", "addFile", String.class, "p_0", f).get());
			timeit("Outline", () -> dispatcher.sendMultiValueRequest("LanguageService", "getNavigationBarItems", NavigationBarItemPojo.class, "p_0", f).get());
		}
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
}
