package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public static Builder create(int start, int length) {
		return new BuilderImpl(new TextSpanPojo(), start, length);
	}

	public static class BuilderImpl implements Builder {
		private final TextSpanPojo pojo;

		BuilderImpl(TextSpanPojo pojo, int start, int length) {
			this.pojo = pojo;
			this.pojo.start = (int)start;
			this.pojo.length = (int)length;
		}


		public TextSpan build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "TextSpan@"+hashCode()+"[start = "+start()+", length = "+length()+"]";
	}
}
