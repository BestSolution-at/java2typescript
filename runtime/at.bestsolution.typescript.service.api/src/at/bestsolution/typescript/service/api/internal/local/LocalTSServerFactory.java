package at.bestsolution.typescript.service.api.internal.local;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;

import at.bestsolution.typescript.service.api.TSServer;
import at.bestsolution.typescript.service.api.TSServerFactory;

@Component
public class LocalTSServerFactory implements TSServerFactory {
	private Map<String, TSServer> serverMap = new HashMap<>();

	public TSServer getServer(String id, Consumer<TSServer> consumer) {
		return serverMap.computeIfAbsent(id, (key) -> {
			LocalTSServer ts = new LocalTSServer(id);
			consumer.accept(ts);
			return ts;
		} );
	}
}
