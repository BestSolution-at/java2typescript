package at.bestsolution.typescript.service.api.model;

public interface QuickInfo  {
	public ScriptElementKind kind();
	public java.util.List<? extends ScriptElementKindModifier> kindModifiers();
	public TextSpan textSpan();
	public java.util.List<? extends SymbolDisplayPart> displayParts();
	public java.util.List<? extends SymbolDisplayPart> documentation();
}
