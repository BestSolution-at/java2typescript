package at.bestsolution.typescript.service.api.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

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

//		Files.readAllLines(Paths.get(projectLocation+"/sample.ts"));

		service.open(Paths.get(projectLocation+"/sample.ts").toAbsolutePath().toString());
		List<? extends NavigationBarItem> navbar = service.navbar(Paths.get(projectLocation+"/sample.ts").toAbsolutePath().toString());
		System.err.println(navbar);

//		service.completions(line, offset, prefix, file);

		System.err.println(tsServiceFactory);

		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
