package at.bestsolution.typescript.service.api.model;

public interface ReferencesResponseBody  {
	public java.util.List<? extends ReferencesResponseItem> getRefs();
	public String getSymbolName();
	public int getSymbolStartOffset();
	public String getSymbolDisplayString();
}
