package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class HighlightSpanPojo  implements HighlightSpan {
	private String fileName ;
	private TextSpanPojo textSpan ;
	private String kind  = "none";
	private at.bestsolution.typescript.service.api.model.HighlightSpanKind _kind = null;

	public HighlightSpanPojo() {
	}

	public String fileName() {
		return this.fileName;
	}
	public TextSpan textSpan() {
		return this.textSpan;
	}
	public HighlightSpanKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.HighlightSpanKind.fromStringValue(this.kind);
	}
	public static Builder create(TextSpan textSpan, HighlightSpanKind kind) {
		return new BuilderImpl(new HighlightSpanPojo(), textSpan, kind);
	}

	public static class BuilderImpl implements Builder {
		private final HighlightSpanPojo pojo;

		BuilderImpl(HighlightSpanPojo pojo, TextSpan textSpan, HighlightSpanKind kind) {
			this.pojo = pojo;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo._kind = kind;
		}

		public Builder fileName( String value ) {
			this.pojo.fileName = (String)value;
			return this;
		}

		public HighlightSpan build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "HighlightSpan@"+hashCode()+"[fileName = "+fileName()+", textSpan = "+textSpan()+", kind = "+kind()+"]";
	}
}
