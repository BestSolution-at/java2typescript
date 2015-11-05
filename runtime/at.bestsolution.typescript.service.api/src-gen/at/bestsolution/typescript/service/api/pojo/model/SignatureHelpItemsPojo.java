package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SignatureHelpItems;

public class SignatureHelpItemsPojo  implements SignatureHelpItems {
	private java.util.List<SignatureHelpItemPojo> items ;
	private TextSpanPojo applicableSpan ;
	private int selectedItemIndex ;
	private int argumentIndex ;
	private int argumentCount ;

	public SignatureHelpItemsPojo() {
	}

	public java.util.List<SignatureHelpItemPojo> getItems() {
		return this.items;
	}

	public void setItems(java.util.List<SignatureHelpItemPojo> items) {
		this.items = items;
	}
	public TextSpanPojo getApplicableSpan() {
		return this.applicableSpan;
	}

	public void setApplicableSpan(TextSpanPojo applicableSpan) {
		this.applicableSpan = applicableSpan;
	}
	public int getSelectedItemIndex() {
		return this.selectedItemIndex;
	}

	public void setSelectedItemIndex(int selectedItemIndex) {
		this.selectedItemIndex = selectedItemIndex;
	}
	public int getArgumentIndex() {
		return this.argumentIndex;
	}

	public void setArgumentIndex(int argumentIndex) {
		this.argumentIndex = argumentIndex;
	}
	public int getArgumentCount() {
		return this.argumentCount;
	}

	public void setArgumentCount(int argumentCount) {
		this.argumentCount = argumentCount;
	}

	public String toString() {
		return "SignatureHelpItems@"+hashCode()+"[items = "+items+", applicableSpan = "+applicableSpan+", selectedItemIndex = "+selectedItemIndex+", argumentIndex = "+argumentIndex+", argumentCount = "+argumentCount+"]";
	}
}
