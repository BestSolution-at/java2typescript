package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class DocumentHighlightsItem  {
	private String file ;
	private HighlightSpan[] highlightSpans ;

	public DocumentHighlightsItem() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public HighlightSpan[] getHighlightSpans() {
		return this.highlightSpans;
	}

	public void setHighlightSpans(HighlightSpan[] highlightSpans) {
		this.highlightSpans = highlightSpans;
	}

	public String toString() {
		return "DocumentHighlightsItem@"+hashCode()+"[file = "+file+", highlightSpans = "+highlightSpans+"]";
	}
}
