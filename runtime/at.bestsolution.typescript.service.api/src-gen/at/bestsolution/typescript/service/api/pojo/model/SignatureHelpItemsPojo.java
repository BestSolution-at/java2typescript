package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.SignatureHelpItems;

public class SignatureHelpItemsPojo  implements SignatureHelpItems {
	private java.util.List<SignatureHelpItemPojo> items ;
	private TextSpanPojo applicableSpan ;
	private int selectedItemIndex ;
	private int argumentIndex ;
	private int argumentCount ;

	public SignatureHelpItemsPojo() {
	}

	public java.util.List<SignatureHelpItemPojo> items() {
		return this.items;
	}
	public TextSpanPojo applicableSpan() {
		return this.applicableSpan;
	}
	public int selectedItemIndex() {
		return this.selectedItemIndex;
	}
	public int argumentIndex() {
		return this.argumentIndex;
	}
	public int argumentCount() {
		return this.argumentCount;
	}

	public String toString() {
		return "SignatureHelpItems@"+hashCode()+"[items = "+items()+", applicableSpan = "+applicableSpan()+", selectedItemIndex = "+selectedItemIndex()+", argumentIndex = "+argumentIndex()+", argumentCount = "+argumentCount()+"]";
	}
}
