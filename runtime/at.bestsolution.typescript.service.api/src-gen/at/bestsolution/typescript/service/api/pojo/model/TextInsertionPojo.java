package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public static Builder create(String newText, int caretOffset) {
		return new BuilderImpl(new TextInsertionPojo(), newText, caretOffset);
	}

	public static class BuilderImpl implements Builder {
		private final TextInsertionPojo pojo;

		BuilderImpl(TextInsertionPojo pojo, String newText, int caretOffset) {
			this.pojo = pojo;
			this.pojo.newText = (String)newText;
			this.pojo.caretOffset = (int)caretOffset;
		}


		public TextInsertion build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "TextInsertion@"+hashCode()+"[newText = "+newText()+", caretOffset = "+caretOffset()+"]";
	}
}
