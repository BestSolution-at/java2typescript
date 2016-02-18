package at.bestsolution.typescript.service.api.model;

public interface SymbolDisplayPart  {
	public String text();
	public SymbolDisplayPartKind kind();

	public interface Builder {
		public SymbolDisplayPart build();
	}
}
