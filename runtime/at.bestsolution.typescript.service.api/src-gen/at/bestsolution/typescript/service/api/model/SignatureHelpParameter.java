package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpParameter  {
	public String getName();
	public java.util.List<? extends SymbolDisplayPart> getDocumentation();
	public java.util.List<? extends SymbolDisplayPart> getDisplayParts();
	public boolean getIsOptional();
}
