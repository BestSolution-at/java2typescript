package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.TextInsertion;

public class TextInsertionPojo  implements TextInsertion {
	private String newText ;
	private int caretOffset ;

	public TextInsertionPojo() {
	}

	public String newText() {
		return this.newText;
	}
	public int caretOffset() {
		return this.caretOffset;
	}

	public String toString() {
		return "TextInsertion@"+hashCode()+"[newText = "+newText()+", caretOffset = "+caretOffset()+"]";
	}
}
