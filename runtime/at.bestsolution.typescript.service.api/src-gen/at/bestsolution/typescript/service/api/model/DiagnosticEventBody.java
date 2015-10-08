package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class DiagnosticEventBody  {
	private String file ;
	private Diagnostic[] diagnostics ;

	public DiagnosticEventBody() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public Diagnostic[] getDiagnostics() {
		return this.diagnostics;
	}

	public void setDiagnostics(Diagnostic[] diagnostics) {
		this.diagnostics = diagnostics;
	}

	public String toString() {
		return "DiagnosticEventBody@"+hashCode()+"[file = "+file+", diagnostics = "+diagnostics+"]";
	}
}
