package at.bestsolution.typescript.service.api;

import java.util.function.Consumer;

public interface TSServerConfiguration {
	public String getServerBinary();
	public void addConfigurationChangeConsumer(Consumer<String> consumer);
	public void removeConfigurationChangeConsumer(Consumer<String> consumer);
}
