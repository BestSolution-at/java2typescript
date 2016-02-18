package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class DiagnosticMessageChainPojo  implements DiagnosticMessageChain {
	private String messageText ;
	private String category  = "Warning";
	private at.bestsolution.typescript.service.api.model.DiagnosticCategory _category = null;
	private int code ;
	private DiagnosticMessageChainPojo next ;

	public DiagnosticMessageChainPojo() {
	}

	public String messageText() {
		return this.messageText;
	}
	public DiagnosticCategory category() {
		if( _category != null ) return _category;
		return _category = at.bestsolution.typescript.service.api.model.DiagnosticCategory.fromStringValue(this.category);
	}
	public int code() {
		return this.code;
	}
	public DiagnosticMessageChain next() {
		return this.next;
	}
	public static Builder create(String messageText, DiagnosticCategory category, int code) {
		return new BuilderImpl(new DiagnosticMessageChainPojo(), messageText, category, code);
	}

	public static class BuilderImpl implements Builder {
		private final DiagnosticMessageChainPojo pojo;

		BuilderImpl(DiagnosticMessageChainPojo pojo, String messageText, DiagnosticCategory category, int code) {
			this.pojo = pojo;
			this.pojo.messageText = (String)messageText;
			this.pojo._category = category;
			this.pojo.code = (int)code;
		}

		public Builder next( DiagnosticMessageChain value ) {
			this.pojo.next = (DiagnosticMessageChainPojo)value;
			return this;
		}

		public DiagnosticMessageChain build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "DiagnosticMessageChain@"+hashCode()+"[messageText = "+messageText()+", category = "+category()+", code = "+code()+", next = "+next()+"]";
	}
}
