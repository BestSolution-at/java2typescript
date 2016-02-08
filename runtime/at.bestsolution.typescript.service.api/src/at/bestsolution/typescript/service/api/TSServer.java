package at.bestsolution.typescript.service.api;

public interface TSServer {
	public <S> S getService(Class<S> service);
}
