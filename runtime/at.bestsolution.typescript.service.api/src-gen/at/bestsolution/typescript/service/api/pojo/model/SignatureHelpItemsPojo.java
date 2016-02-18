package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class SignatureHelpItemsPojo  implements SignatureHelpItems {
	private java.util.List<SignatureHelpItemPojo> items ;
	private TextSpanPojo applicableSpan ;
	private int selectedItemIndex ;
	private int argumentIndex ;
	private int argumentCount ;

	public SignatureHelpItemsPojo() {
	}

	public java.util.List<SignatureHelpItem> items() {
		return (java.util.List<SignatureHelpItem>)((java.util.List<?>)this.items);
	}
	public TextSpan applicableSpan() {
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
	public static Builder create(java.util.List<SignatureHelpItem> items, TextSpan applicableSpan, int selectedItemIndex, int argumentIndex, int argumentCount) {
		return new BuilderImpl(new SignatureHelpItemsPojo(), items, applicableSpan, selectedItemIndex, argumentIndex, argumentCount);
	}

	public static class BuilderImpl implements Builder {
		private final SignatureHelpItemsPojo pojo;

		BuilderImpl(SignatureHelpItemsPojo pojo, java.util.List<SignatureHelpItem> items, TextSpan applicableSpan, int selectedItemIndex, int argumentIndex, int argumentCount) {
			this.pojo = pojo;
			this.pojo.items = (java.util.List<SignatureHelpItemPojo>)(java.util.List<?>)items;
			this.pojo.applicableSpan = (TextSpanPojo)applicableSpan;
			this.pojo.selectedItemIndex = (int)selectedItemIndex;
			this.pojo.argumentIndex = (int)argumentIndex;
			this.pojo.argumentCount = (int)argumentCount;
		}


		public SignatureHelpItems build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "SignatureHelpItems@"+hashCode()+"[items = "+items()+", applicableSpan = "+applicableSpan()+", selectedItemIndex = "+selectedItemIndex()+", argumentIndex = "+argumentIndex()+", argumentCount = "+argumentCount()+"]";
	}
}
