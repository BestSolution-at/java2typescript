package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.FileSpan;

public class FileSpanPojo extends TextSpanPojo implements FileSpan {
	private String file ;

	public FileSpanPojo() {
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
