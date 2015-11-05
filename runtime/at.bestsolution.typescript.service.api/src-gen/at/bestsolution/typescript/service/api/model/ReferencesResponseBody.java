package at.bestsolution.typescript.service.api.model;

public interface ReferencesResponseBody  {
	public ReferencesResponseItem[] getRefs();
	public String getSymbolName();
	public int getSymbolStartOffset();
	public String getSymbolDisplayString();
}
