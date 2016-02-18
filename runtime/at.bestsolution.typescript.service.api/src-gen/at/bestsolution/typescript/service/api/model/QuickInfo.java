package at.bestsolution.typescript.service.api.model;

public interface QuickInfo  {
	public ScriptElementKind kind();
	public java.util.List<ScriptElementKindModifier> kindModifiers();
	public TextSpan textSpan();
	public java.util.List<SymbolDisplayPart> displayParts();
	public java.util.List<SymbolDisplayPart> documentation();

	public interface Builder {
		public QuickInfo build();
	}
}
