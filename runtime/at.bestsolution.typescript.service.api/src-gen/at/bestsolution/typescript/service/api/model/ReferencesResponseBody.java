package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class ReferencesResponseBody  {
	private ReferencesResponseItem[] refs ;
	private String symbolName ;
	private int symbolStartOffset ;
	private String symbolDisplayString ;

	public ReferencesResponseBody() {
	}

	public ReferencesResponseItem[] getRefs() {
		return this.refs;
	}

	public void setRefs(ReferencesResponseItem[] refs) {
		this.refs = refs;
	}
	public String getSymbolName() {
		return this.symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}
	public int getSymbolStartOffset() {
		return this.symbolStartOffset;
	}

	public void setSymbolStartOffset(int symbolStartOffset) {
		this.symbolStartOffset = symbolStartOffset;
	}
	public String getSymbolDisplayString() {
		return this.symbolDisplayString;
	}

	public void setSymbolDisplayString(String symbolDisplayString) {
		this.symbolDisplayString = symbolDisplayString;
	}

	public String toString() {
		return "ReferencesResponseBody@"+hashCode()+"[refs = "+refs+", symbolName = "+symbolName+", symbolStartOffset = "+symbolStartOffset+", symbolDisplayString = "+symbolDisplayString+"]";
	}
}
