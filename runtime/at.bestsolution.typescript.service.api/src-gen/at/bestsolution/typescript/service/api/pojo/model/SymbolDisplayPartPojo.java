package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SymbolDisplayPart;

public class SymbolDisplayPartPojo  implements SymbolDisplayPart {
	private String text ;
	private String kind ;

	public SymbolDisplayPartPojo() {
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
