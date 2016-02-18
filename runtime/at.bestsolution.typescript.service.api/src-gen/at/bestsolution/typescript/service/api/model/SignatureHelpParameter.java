package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpParameter  {
	public String name();
	public java.util.List<SymbolDisplayPart> documentation();
	public java.util.List<SymbolDisplayPart> displayParts();
	public boolean isOptional();

	public interface Builder {
		public SignatureHelpParameter build();
	}
}
