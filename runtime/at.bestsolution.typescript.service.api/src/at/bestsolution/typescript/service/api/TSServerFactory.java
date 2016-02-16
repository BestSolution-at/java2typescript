package at.bestsolution.typescript.service.api;

import java.util.function.Consumer;

public interface TSServerFactory {
	public TSServer getServer(String id, Consumer<TSServer> initialization);
}
