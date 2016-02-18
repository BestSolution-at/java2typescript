package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public static Builder create(String name, boolean writeByteOrderMark, String text) {
		return new BuilderImpl(new OutputFilePojo(), name, writeByteOrderMark, text);
	}

	public static class BuilderImpl implements Builder {
		private final OutputFilePojo pojo;

		BuilderImpl(OutputFilePojo pojo, String name, boolean writeByteOrderMark, String text) {
			this.pojo = pojo;
			this.pojo.name = (String)name;
			this.pojo.writeByteOrderMark = (boolean)writeByteOrderMark;
			this.pojo.text = (String)text;
		}


		public OutputFile build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "OutputFile@"+hashCode()+"[name = "+name()+", writeByteOrderMark = "+writeByteOrderMark()+", text = "+text()+"]";
	}
}
