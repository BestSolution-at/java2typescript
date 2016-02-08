package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.DocumentHighlights;

public class DocumentHighlightsPojo  implements DocumentHighlights {
	private String fileName ;
	private java.util.List<HighlightSpanPojo> highlightSpans ;

	public DocumentHighlightsPojo() {
	}

	public String fileName() {
		return this.fileName;
	}
	public java.util.List<HighlightSpanPojo> highlightSpans() {
		return this.highlightSpans;
	}

	public String toString() {
		return "DocumentHighlights@"+hashCode()+"[fileName = "+fileName()+", highlightSpans = "+highlightSpans()+"]";
	}
}
