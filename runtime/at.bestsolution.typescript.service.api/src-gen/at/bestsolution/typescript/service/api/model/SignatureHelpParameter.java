package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpParameter  {
	public String name();
	public java.util.List<? extends SymbolDisplayPart> documentation();
	public java.util.List<? extends SymbolDisplayPart> displayParts();
	public boolean isOptional();
}
