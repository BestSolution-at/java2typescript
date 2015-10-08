package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class SymbolDisplayPart  {
	private String text ;
	private String kind ;

	public SymbolDisplayPart() {
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String toString() {
		return "SymbolDisplayPart@"+hashCode()+"[text = "+text+", kind = "+kind+"]";
	}
}
