package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItem  {
	public boolean getIsVariadic();
	public SymbolDisplayPart[] getPrefixDisplayParts();
	public SymbolDisplayPart[] getSuffixDisplayParts();
	public SymbolDisplayPart[] getSeparatorDisplayParts();
	public SignatureHelpParameter[] getParameters();
	public SymbolDisplayPart[] getDocumentation();
}
