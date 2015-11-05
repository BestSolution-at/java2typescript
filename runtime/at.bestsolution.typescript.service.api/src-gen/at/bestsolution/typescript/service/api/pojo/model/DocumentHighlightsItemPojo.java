package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.DocumentHighlightsItem;

public class DocumentHighlightsItemPojo  implements DocumentHighlightsItem {
	private String file ;
	private HighlightSpanPojo[] highlightSpans ;

	public DocumentHighlightsItemPojo() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public HighlightSpanPojo[] getHighlightSpans() {
		return this.highlightSpans;
	}

	public void setHighlightSpans(HighlightSpanPojo[] highlightSpans) {
		this.highlightSpans = highlightSpans;
	}

	public String toString() {
		return "DocumentHighlightsItem@"+hashCode()+"[file = "+file+", highlightSpans = "+highlightSpans+"]";
	}
}
