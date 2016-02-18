package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class DiagnosticMessagePojo  implements DiagnosticMessage {
	private String messageText ;
	private DiagnosticMessageChainPojo messageChain ;

	public DiagnosticMessagePojo() {
	}

	public String messageText() {
		return this.messageText;
	}
	public DiagnosticMessageChain messageChain() {
		return this.messageChain;
	}
	public static Builder create(String messageText, DiagnosticMessageChain messageChain) {
		return new BuilderImpl(new DiagnosticMessagePojo(), messageText, messageChain);
	}

	public static class BuilderImpl implements Builder {
		private final DiagnosticMessagePojo pojo;

		BuilderImpl(DiagnosticMessagePojo pojo, String messageText, DiagnosticMessageChain messageChain) {
			this.pojo = pojo;
			this.pojo.messageText = (String)messageText;
			this.pojo.messageChain = (DiagnosticMessageChainPojo)messageChain;
		}


		public DiagnosticMessage build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "DiagnosticMessage@"+hashCode()+"[messageText = "+messageText()+", messageChain = "+messageChain()+"]";
	}
}
