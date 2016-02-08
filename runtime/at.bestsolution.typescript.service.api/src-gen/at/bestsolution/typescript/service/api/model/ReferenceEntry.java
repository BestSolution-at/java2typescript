package at.bestsolution.typescript.service.api.model;

public interface ReferenceEntry  {
	public TextSpan textSpan();
	public String fileName();
	public boolean isWriteAccess();
}
