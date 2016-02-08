package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.DiagnosticMessage;

public class DiagnosticMessagePojo  implements DiagnosticMessage {
	private String messageText ;
	private DiagnosticMessageChainPojo messageChain ;

	public DiagnosticMessagePojo() {
	}

	public String messageText() {
		return this.messageText;
	}
	public DiagnosticMessageChainPojo messageChain() {
		return this.messageChain;
	}

	public String toString() {
		return "DiagnosticMessage@"+hashCode()+"[messageText = "+messageText()+", messageChain = "+messageChain()+"]";
	}
}
