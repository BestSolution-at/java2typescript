package at.bestsolution.typescript.service.api.internal.local;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import at.bestsolution.typescript.service.api.TSServer;
import at.bestsolution.typescript.service.api.TSServerFactory;

@Component
public class LocalTSServerFactory implements TSServerFactory {
	private Map<String, TSServer> serverMap = new HashMap<>();

	public TSServer getServer(String id) {
		return serverMap.computeIfAbsent(id, (key) -> new LocalTSServer(id) );
	}
}
