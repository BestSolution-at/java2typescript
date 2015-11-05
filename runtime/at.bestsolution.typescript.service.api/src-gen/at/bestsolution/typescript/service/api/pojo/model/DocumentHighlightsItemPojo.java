package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.DocumentHighlightsItem;

public class DocumentHighlightsItemPojo  implements DocumentHighlightsItem {
	private String file ;
	private java.util.List<HighlightSpanPojo> highlightSpans ;

	public DocumentHighlightsItemPojo() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public java.util.List<HighlightSpanPojo> getHighlightSpans() {
		return this.highlightSpans;
	}

	public void setHighlightSpans(java.util.List<HighlightSpanPojo> highlightSpans) {
		this.highlightSpans = highlightSpans;
	}

	public String toString() {
		return "DocumentHighlightsItem@"+hashCode()+"[file = "+file+", highlightSpans = "+highlightSpans+"]";
	}
}
