package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.ReferencesResponseBody;

public class ReferencesResponseBodyPojo  implements ReferencesResponseBody {
	private java.util.List<ReferencesResponseItemPojo> refs ;
	private String symbolName ;
	private int symbolStartOffset ;
	private String symbolDisplayString ;

	public ReferencesResponseBodyPojo() {
	}

	public java.util.List<ReferencesResponseItemPojo> getRefs() {
		return this.refs;
	}

	public void setRefs(java.util.List<ReferencesResponseItemPojo> refs) {
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
