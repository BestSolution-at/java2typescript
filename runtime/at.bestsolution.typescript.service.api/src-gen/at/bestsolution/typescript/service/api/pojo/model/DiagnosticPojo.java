package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.Diagnostic;

public class DiagnosticPojo  implements Diagnostic {
	private SourceFilePojo file ;
	private int start ;
	private int length ;
	private DiagnosticMessagePojo message ;
	private String category  = "Warning";
	private at.bestsolution.typescript.service.api.model.DiagnosticCategory _category = null;
	private int code ;

	public DiagnosticPojo() {
	}

	public SourceFilePojo file() {
		return this.file;
	}
	public int start() {
		return this.start;
	}
	public int length() {
		return this.length;
	}
	public DiagnosticMessagePojo message() {
		return this.message;
	}
	public at.bestsolution.typescript.service.api.model.DiagnosticCategory category() {
		if( _category != null ) return _category;
		return _category = at.bestsolution.typescript.service.api.model.DiagnosticCategory.fromStringValue(this.category);
	}
	public int code() {
		return this.code;
	}

	public String toString() {
		return "Diagnostic@"+hashCode()+"[file = "+file()+", start = "+start()+", length = "+length()+", message = "+message()+", category = "+category()+", code = "+code()+"]";
	}
}
