package at.bestsolution.typescript.service.api.model;

public interface ReferencedSymbol  {
	public DefinitionInfo definition();
	public java.util.List<? extends ReferenceEntry> references();
}
