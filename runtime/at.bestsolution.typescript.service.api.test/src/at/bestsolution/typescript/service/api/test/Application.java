package at.bestsolution.typescript.service.api.test;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.typescript.service.api.TSServer;
import at.bestsolution.typescript.service.api.TSServerFactory;
import at.bestsolution.typescript.service.api.model.CompletionInfo;
import at.bestsolution.typescript.service.api.services.LanguageService;
import at.bestsolution.typescript.service.api.services.ModelBuilderService;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		String projectLocation = null;

		Map arguments = context.getArguments();
		String[] args = (String[]) arguments.get("application.args");
		for( int i = 0; i < args.length; i++ ) {
			if( args[i].equals("-ts-root") ) {
				projectLocation = args[i+1];
				break;
			}
		}

		BundleContext bctx = FrameworkUtil.getBundle(getClass()).getBundleContext();

		ServiceReference<TSServerFactory> reference = bctx.getServiceReference(TSServerFactory.class);

		TSServerFactory tsServiceFactory = bctx.getService(reference);
		TSServer server = tsServiceFactory.getServer(UUID.randomUUID().toString(), ts -> {
			LanguageService languageService = ts.getService(LanguageService.class);
			ModelBuilderService modelService = ts.getService(ModelBuilderService.class);
			languageService.initProject(modelService.createCompilerOptions(true).build(), Collections.emptyList());
		});

		LanguageService service = server.getService(LanguageService.class);
		String fileId = service.addFile(getClass().getResource("sample.ts").toExternalForm());
		service.addFile(getClass().getResource("Car.ts").toExternalForm());
		System.err.println(service.getNavigationBarItems(fileId));

//		CompletionInfo info = service.getCompletionsAtPosition(fileId, 424);
//		System.err.println(info);

//		System.err.println(service.getCompletionEntryDetails(fileId, 424, "firstname"));
		System.err.println(service.getCompletionEntryDetails(fileId, 447, "car"));

//		info.entries().stream().forEach( i -> {
//			System.err.println(service.getCompletionEntryDetails(fileId, 424, i.name()));
//		});



//		Path path = Paths.get("/Users/tomschindl/simply-code/test.ts");
//		String filePath = path.toAbsolutePath().toString();
//		System.err.println("1. Open file");
//		service.open("/Users/tomschindl/git/TypeScriptSamples/simple/animals.ts");
//
//		System.err.println("2. Get the outline data");
//		List<? extends NavigationBarItem> navbar = service.navbar("/Users/tomschindl/git/TypeScriptSamples/simple/animals.ts");
//		System.err.println(navbar);
//
//		service.syntaxDiag( d -> {
//			System.err.println(d.getDiagnostics());
//		});

//		System.err.println(service.projectInfo(filePath, true));

//		System.err.println("3. Request errors");
//		List<String> paths = new ArrayList<>();
//		paths.add(filePath);
//		service.geterr(1000, paths);
//
//		System.err.println("4. Get autocomplete");
//		List<? extends CompletionEntry> completions = service.completions(2, 5, "", filePath);
//		System.err.println(completions);

//		System.in.read();

		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
