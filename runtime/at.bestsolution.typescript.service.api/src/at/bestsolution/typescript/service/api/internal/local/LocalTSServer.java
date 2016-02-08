package at.bestsolution.typescript.service.api.internal.local;

import java.util.concurrent.ExecutionException;

import at.bestsolution.typescript.service.api.TSServer;
import at.bestsolution.typescript.service.api.internal.impl.LanguageServiceImpl;
import at.bestsolution.typescript.service.api.services.Dispatcher;
import at.bestsolution.typescript.service.api.services.LanguageService;

public class LocalTSServer implements TSServer {
	private String id;
	private String projectId;
	private Dispatcher dispatcher;

	public LocalTSServer(String id) {
		this.id = id;
		try {
			// Check if V8 is available
			getClass().getClassLoader().loadClass("com.eclipsesource.v8.V8");
			this.dispatcher = new V8Dispatcher();
		} catch( Throwable t ) {
			this.dispatcher = new NashornDispatcher();
		}

		try {
			this.projectId = (String) this.dispatcher.sendSingleValueRequest("LanguageService", "createProject", String.class, id).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public <S> S getService(Class<S> service) {
		if( service == LanguageService.class ) {
			return (S) new LanguageServiceImpl(projectId, dispatcher);
		}
		return null;
	}

}
