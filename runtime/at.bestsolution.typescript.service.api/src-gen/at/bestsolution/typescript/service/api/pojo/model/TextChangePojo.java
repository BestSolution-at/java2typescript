package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.TextChange;

public class TextChangePojo  implements TextChange {
	private TextSpanPojo span ;
	private int newLength ;

	public TextChangePojo() {
	}

	public TextSpanPojo span() {
		return this.span;
	}
	public int newLength() {
		return this.newLength;
	}

	public String toString() {
		return "TextChange@"+hashCode()+"[span = "+span()+", newLength = "+newLength()+"]";
	}
}
