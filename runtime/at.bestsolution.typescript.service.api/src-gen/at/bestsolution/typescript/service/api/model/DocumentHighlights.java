package at.bestsolution.typescript.service.api.model;

public interface DocumentHighlights  {
	public String fileName();
	public java.util.List<? extends HighlightSpan> highlightSpans();
}
