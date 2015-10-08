package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class FileSpan extends TextSpan {
	private String file ;

	public FileSpan() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String toString() {
		return "FileSpan@"+hashCode()+"[file = "+file+"]";
	}
}
