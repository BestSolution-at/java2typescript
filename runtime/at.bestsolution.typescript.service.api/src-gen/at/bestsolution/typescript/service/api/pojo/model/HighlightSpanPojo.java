package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.HighlightSpan;

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
	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public at.bestsolution.typescript.service.api.model.HighlightSpanKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.HighlightSpanKind.fromStringValue(this.kind);
	}

	public String toString() {
		return "HighlightSpan@"+hashCode()+"[fileName = "+fileName()+", textSpan = "+textSpan()+", kind = "+kind()+"]";
	}
}
