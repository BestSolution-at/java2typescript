package at.bestsolution.typescript.service.api.model;

public interface ReferencedSymbol  {
	public DefinitionInfo definition();
	public java.util.List<ReferenceEntry> references();

	public interface Builder {
		public ReferencedSymbol build();
	}
}
