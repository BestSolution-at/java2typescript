package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItem  {
	public boolean isVariadic();
	public java.util.List<SymbolDisplayPart> prefixDisplayParts();
	public java.util.List<SymbolDisplayPart> suffixDisplayParts();
	public java.util.List<SymbolDisplayPart> separatorDisplayParts();
	public java.util.List<SignatureHelpParameter> parameters();
	public java.util.List<SymbolDisplayPart> documentation();

	public interface Builder {
		public SignatureHelpItem build();
	}
}
