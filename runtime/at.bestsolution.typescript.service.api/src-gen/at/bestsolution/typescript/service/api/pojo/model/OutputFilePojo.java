package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.OutputFile;

public class OutputFilePojo  implements OutputFile {
	private String name ;
	private boolean writeByteOrderMark ;
	private String text ;

	public OutputFilePojo() {
	}

	public String name() {
		return this.name;
	}
	public boolean writeByteOrderMark() {
		return this.writeByteOrderMark;
	}
	public String text() {
		return this.text;
	}

	public String toString() {
		return "OutputFile@"+hashCode()+"[name = "+name()+", writeByteOrderMark = "+writeByteOrderMark()+", text = "+text()+"]";
	}
}
