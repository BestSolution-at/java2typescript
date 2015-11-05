package at.bestsolution.typescript.service.api.model;

public interface DiagnosticEventBody  {
	public String getFile();
	public java.util.List<? extends Diagnostic> getDiagnostics();
}
