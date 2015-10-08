package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class HighlightSpan extends TextSpan {
	private String kind ;

	public HighlightSpan() {
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
