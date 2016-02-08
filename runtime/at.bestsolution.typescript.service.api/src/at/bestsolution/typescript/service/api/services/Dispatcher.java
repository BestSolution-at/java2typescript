package at.bestsolution.typescript.service.api.services;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface Dispatcher {
	public void sendVoidRequest(String service, String method, Object... parameters);
	public <T> CompletableFuture<T> sendSingleValueRequest(String service, String method, Class<T> clazz, Object... parameters);
	public <T> CompletableFuture<List<T>> sendMultiValueRequest(String service, String method, Class<T> clazz, Object... parameters);
}
