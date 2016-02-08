package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.DiagnosticMessageChain;

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
	public at.bestsolution.typescript.service.api.model.DiagnosticCategory category() {
		if( _category != null ) return _category;
		return _category = at.bestsolution.typescript.service.api.model.DiagnosticCategory.fromStringValue(this.category);
	}
	public int code() {
		return this.code;
	}
	public DiagnosticMessageChainPojo next() {
		return this.next;
	}

	public String toString() {
		return "DiagnosticMessageChain@"+hashCode()+"[messageText = "+messageText()+", category = "+category()+", code = "+code()+", next = "+next()+"]";
	}
}
