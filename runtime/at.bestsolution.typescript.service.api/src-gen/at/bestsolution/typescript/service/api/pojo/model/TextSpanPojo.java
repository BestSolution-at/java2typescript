package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.TextSpan;

public class TextSpanPojo  implements TextSpan {
	private int start ;
	private int length ;

	public TextSpanPojo() {
	}

	public int start() {
		return this.start;
	}
	public int length() {
		return this.length;
	}

	public String toString() {
		return "TextSpan@"+hashCode()+"[start = "+start()+", length = "+length()+"]";
	}
}
