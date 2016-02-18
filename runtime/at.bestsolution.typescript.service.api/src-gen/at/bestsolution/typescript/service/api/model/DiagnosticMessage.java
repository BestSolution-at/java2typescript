package at.bestsolution.typescript.service.api.model;

public interface DiagnosticMessage  {
	public String messageText();
	public DiagnosticMessageChain messageChain();

	public interface Builder {
		public DiagnosticMessage build();
	}
}
