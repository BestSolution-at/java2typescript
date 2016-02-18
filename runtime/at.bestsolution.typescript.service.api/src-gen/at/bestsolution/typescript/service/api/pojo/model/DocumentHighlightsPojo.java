package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class DocumentHighlightsPojo  implements DocumentHighlights {
	private String fileName ;
	private java.util.List<HighlightSpanPojo> highlightSpans ;

	public DocumentHighlightsPojo() {
	}

	public String fileName() {
		return this.fileName;
	}
	public java.util.List<HighlightSpan> highlightSpans() {
		return (java.util.List<HighlightSpan>)((java.util.List<?>)this.highlightSpans);
	}
	public static Builder create(String fileName, java.util.List<HighlightSpan> highlightSpans) {
		return new BuilderImpl(new DocumentHighlightsPojo(), fileName, highlightSpans);
	}

	public static class BuilderImpl implements Builder {
		private final DocumentHighlightsPojo pojo;

		BuilderImpl(DocumentHighlightsPojo pojo, String fileName, java.util.List<HighlightSpan> highlightSpans) {
			this.pojo = pojo;
			this.pojo.fileName = (String)fileName;
			this.pojo.highlightSpans = (java.util.List<HighlightSpanPojo>)(java.util.List<?>)highlightSpans;
		}


		public DocumentHighlights build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "DocumentHighlights@"+hashCode()+"[fileName = "+fileName()+", highlightSpans = "+highlightSpans()+"]";
	}
}
