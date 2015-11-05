package at.bestsolution.typescript.service.api.model;

public interface CompletionEntryDetails  {
	public String getName();
	public String getKind();
	public String getKindModifiers();
	public SymbolDisplayPart[] getDisplayParts();
	public SymbolDisplayPart[] getDocumentation();
}
