package at.bestsolution.typescript.service.api.model;

public interface Diagnostic  {
	public SourceFile file();
	public int start();
	public int length();
	public DiagnosticMessage message();
	public DiagnosticCategory category();
	public int code();
}
