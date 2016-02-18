package at.bestsolution.typescript.service.api.model;

public interface DocumentHighlights  {
	public String fileName();
	public java.util.List<HighlightSpan> highlightSpans();

	public interface Builder {
		public DocumentHighlights build();
	}
}
