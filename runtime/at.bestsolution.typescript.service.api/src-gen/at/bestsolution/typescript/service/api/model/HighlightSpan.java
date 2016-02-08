package at.bestsolution.typescript.service.api.model;

public interface HighlightSpan  {
	public String fileName();
	public TextSpan textSpan();
	public HighlightSpanKind kind();
}
