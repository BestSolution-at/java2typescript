package at.bestsolution.typescript.service.api.model;

public interface CompletionEntryDetails  {
	public String name();
	public ScriptElementKind kind();
	public java.util.List<? extends ScriptElementKindModifier> kindModifiers();
	public java.util.List<? extends SymbolDisplayPart> displayParts();
	public java.util.List<? extends SymbolDisplayPart> documentation();
}
