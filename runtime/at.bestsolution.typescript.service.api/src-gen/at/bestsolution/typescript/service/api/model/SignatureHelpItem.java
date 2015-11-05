package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItem  {
	public boolean getIsVariadic();
	public java.util.List<? extends SymbolDisplayPart> getPrefixDisplayParts();
	public java.util.List<? extends SymbolDisplayPart> getSuffixDisplayParts();
	public java.util.List<? extends SymbolDisplayPart> getSeparatorDisplayParts();
	public java.util.List<? extends SignatureHelpParameter> getParameters();
	public java.util.List<? extends SymbolDisplayPart> getDocumentation();
}
