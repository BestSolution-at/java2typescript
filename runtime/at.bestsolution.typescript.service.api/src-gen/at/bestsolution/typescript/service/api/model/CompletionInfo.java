package at.bestsolution.typescript.service.api.model;

public interface CompletionInfo  {
	public boolean isMemberCompletion();
	public boolean isNewIdentifierLocation();
	public java.util.List<? extends CompletionEntry> entries();
}
