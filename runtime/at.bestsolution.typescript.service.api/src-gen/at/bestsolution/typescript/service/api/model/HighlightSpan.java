package at.bestsolution.typescript.service.api.model;

public interface HighlightSpan  {
	public String fileName();
	public TextSpan textSpan();
	public HighlightSpanKind kind();

	public interface Builder {
		public Builder fileName( String value );
		public HighlightSpan build();
	}
}
