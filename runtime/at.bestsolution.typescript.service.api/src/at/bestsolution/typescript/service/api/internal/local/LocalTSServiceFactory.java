package at.bestsolution.typescript.service.api.internal.local;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import at.bestsolution.typescript.service.api.TSServerConfiguration;
import at.bestsolution.typescript.service.api.services.TSService;
import at.bestsolution.typescript.service.api.services.TSServiceFactory;

@Component
public class LocalTSServiceFactory implements TSServiceFactory {
	private Map<String, TSService> serviceMap = new HashMap<>();
	private TSServerConfiguration configuration;

	@Reference(cardinality=ReferenceCardinality.OPTIONAL,policyOption=ReferencePolicyOption.GREEDY)
	public void setDartServerConfiguration(TSServerConfiguration configuration) {
		this.configuration = configuration;
	}

	public void unsetDartServerConfiguration(TSServerConfiguration configuration) {
		if( this.configuration == configuration ) {
			this.configuration = null;
		}
	}

	@Override
	public TSService getService(String id) {
		TSService s = serviceMap.get(id);
		if (s == null) {
			s = new LocalTSService(configuration, id);
			serviceMap.put(id, s);
		}
		return s;
	}

}
