package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItem  {
	public boolean isVariadic();
	public java.util.List<? extends SymbolDisplayPart> prefixDisplayParts();
	public java.util.List<? extends SymbolDisplayPart> suffixDisplayParts();
	public java.util.List<? extends SymbolDisplayPart> separatorDisplayParts();
	public java.util.List<? extends SignatureHelpParameter> parameters();
	public java.util.List<? extends SymbolDisplayPart> documentation();
}
