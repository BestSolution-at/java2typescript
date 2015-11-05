package at.bestsolution.typescript.service.api.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.typescript.service.api.model.CompletionEntry;
import at.bestsolution.typescript.service.api.model.NavigationBarItem;
import at.bestsolution.typescript.service.api.services.TSService;
import at.bestsolution.typescript.service.api.services.TSServiceFactory;

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

		ServiceReference<TSServiceFactory> reference = bctx.getServiceReference(TSServiceFactory.class);

		TSServiceFactory tsServiceFactory = bctx.getService(reference);
		TSService service = tsServiceFactory.getService(UUID.randomUUID().toString());

		Path path = Paths.get(projectLocation+"/sample.ts");
		String filePath = path.toAbsolutePath().toString();
		System.err.println("1. Open file");
		service.open(filePath);

		System.err.println("2. Get the outline data");
		List<? extends NavigationBarItem> navbar = service.navbar(filePath);
		System.err.println(navbar);

		service.syntaxDiag( d -> {
			System.err.println(d.getDiagnostics());
		});

		System.err.println("3. Request errors");
		List<String> paths = new ArrayList<>();
		paths.add(filePath);
		service.geterr(1000, paths);

		System.err.println("4. Get autocomplete");
		List<? extends CompletionEntry> completions = service.completions(Files.readAllLines(path).size(), 2, "", filePath);
		System.err.println(completions);

		System.in.read();

		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
