package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpParameter  {
	public String getName();
	public SymbolDisplayPart[] getDocumentation();
	public SymbolDisplayPart[] getDisplayParts();
	public boolean getIsOptional();
}
