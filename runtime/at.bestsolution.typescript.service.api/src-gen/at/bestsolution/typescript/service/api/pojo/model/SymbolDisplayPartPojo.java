package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.SymbolDisplayPart;

public class SymbolDisplayPartPojo  implements SymbolDisplayPart {
	private String text ;
	private String kind  = "aliasName";
	private at.bestsolution.typescript.service.api.model.SymbolDisplayPartKind _kind = null;

	public SymbolDisplayPartPojo() {
	}

	public String text() {
		return this.text;
	}
	public at.bestsolution.typescript.service.api.model.SymbolDisplayPartKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.SymbolDisplayPartKind.fromStringValue(this.kind);
	}

	public String toString() {
		return "SymbolDisplayPart@"+hashCode()+"[text = "+text()+", kind = "+kind()+"]";
	}
}
