package at.bestsolution.typescript.service.api.model;

public interface DocumentHighlightsItem  {
	public String getFile();
	public HighlightSpan[] getHighlightSpans();
}
