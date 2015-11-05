package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.DiagnosticEventBody;

public class DiagnosticEventBodyPojo  implements DiagnosticEventBody {
	private String file ;
	private java.util.List<DiagnosticPojo> diagnostics ;

	public DiagnosticEventBodyPojo() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public java.util.List<DiagnosticPojo> getDiagnostics() {
		return this.diagnostics;
	}

	public void setDiagnostics(java.util.List<DiagnosticPojo> diagnostics) {
		this.diagnostics = diagnostics;
	}

	public String toString() {
		return "DiagnosticEventBody@"+hashCode()+"[file = "+file+", diagnostics = "+diagnostics+"]";
	}
}
