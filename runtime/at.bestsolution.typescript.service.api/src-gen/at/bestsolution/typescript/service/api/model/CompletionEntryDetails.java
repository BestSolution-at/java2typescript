package at.bestsolution.typescript.service.api.model;

public interface CompletionEntryDetails  {
	public String name();
	public ScriptElementKind kind();
	public java.util.List<ScriptElementKindModifier> kindModifiers();
	public java.util.List<SymbolDisplayPart> displayParts();
	public java.util.List<SymbolDisplayPart> documentation();

	public interface Builder {
		public CompletionEntryDetails build();
	}
}
