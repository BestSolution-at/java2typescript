package at.bestsolution.typescript.service.api.model;

public interface DiagnosticMessageChain  {
	public String messageText();
	public DiagnosticCategory category();
	public int code();
	public DiagnosticMessageChain next();

	public interface Builder {
		public Builder next( DiagnosticMessageChain value );
		public DiagnosticMessageChain build();
	}
}
