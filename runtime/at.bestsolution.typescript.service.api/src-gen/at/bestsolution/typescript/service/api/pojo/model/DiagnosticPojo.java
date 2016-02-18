package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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

	public SourceFile file() {
		return this.file;
	}
	public int start() {
		return this.start;
	}
	public int length() {
		return this.length;
	}
	public DiagnosticMessage message() {
		return this.message;
	}
	public DiagnosticCategory category() {
		if( _category != null ) return _category;
		return _category = at.bestsolution.typescript.service.api.model.DiagnosticCategory.fromValue(this.category);
	}
	public int code() {
		return this.code;
	}
	public static Builder create(SourceFile file, int start, int length, DiagnosticMessage message, DiagnosticCategory category, int code) {
		return new BuilderImpl(new DiagnosticPojo(), file, start, length, message, category, code);
	}

	public static class BuilderImpl implements Builder {
		private final DiagnosticPojo pojo;

		BuilderImpl(DiagnosticPojo pojo, SourceFile file, int start, int length, DiagnosticMessage message, DiagnosticCategory category, int code) {
			this.pojo = pojo;
			this.pojo.file = (SourceFilePojo)file;
			this.pojo.start = (int)start;
			this.pojo.length = (int)length;
			this.pojo.message = (DiagnosticMessagePojo)message;
			this.pojo._category = category;
			this.pojo.category = category.asValue();
			this.pojo.code = (int)code;
		}


		public Diagnostic build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "Diagnostic@"+hashCode()+"[file = "+file()+", start = "+start()+", length = "+length()+", message = "+message()+", category = "+category()+", code = "+code()+"]";
	}
}
