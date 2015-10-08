package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class SignatureHelpItems  {
	private SignatureHelpItem[] items ;
	private TextSpan applicableSpan ;
	private int selectedItemIndex ;
	private int argumentIndex ;
	private int argumentCount ;

	public SignatureHelpItems() {
	}

	public SignatureHelpItem[] getItems() {
		return this.items;
	}

	public void setItems(SignatureHelpItem[] items) {
		this.items = items;
	}
	public TextSpan getApplicableSpan() {
		return this.applicableSpan;
	}

	public void setApplicableSpan(TextSpan applicableSpan) {
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
