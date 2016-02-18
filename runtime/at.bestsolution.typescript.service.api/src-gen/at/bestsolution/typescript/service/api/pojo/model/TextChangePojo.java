package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class TextChangePojo  implements TextChange {
	private TextSpanPojo span ;
	private int newLength ;

	public TextChangePojo() {
	}

	public TextSpan span() {
		return this.span;
	}
	public int newLength() {
		return this.newLength;
	}
	public static Builder create(TextSpan span, int newLength) {
		return new BuilderImpl(new TextChangePojo(), span, newLength);
	}

	public static class BuilderImpl implements Builder {
		private final TextChangePojo pojo;

		BuilderImpl(TextChangePojo pojo, TextSpan span, int newLength) {
			this.pojo = pojo;
			this.pojo.span = (TextSpanPojo)span;
			this.pojo.newLength = (int)newLength;
		}


		public TextChange build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "TextChange@"+hashCode()+"[span = "+span()+", newLength = "+newLength()+"]";
	}
}
