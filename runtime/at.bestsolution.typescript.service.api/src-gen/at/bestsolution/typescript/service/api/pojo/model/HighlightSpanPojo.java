package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.HighlightSpan;

public class HighlightSpanPojo extends TextSpanPojo implements HighlightSpan {
	private String kind ;

	public HighlightSpanPojo() {
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String toString() {
		return "HighlightSpan@"+hashCode()+"[kind = "+kind+"]";
	}
}
