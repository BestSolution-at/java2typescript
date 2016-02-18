package at.bestsolution.typescript.service.api.model;

public interface CompletionInfo  {
	public boolean isMemberCompletion();
	public boolean isNewIdentifierLocation();
	public java.util.List<CompletionEntry> entries();

	public interface Builder {
		public CompletionInfo build();
	}
}
