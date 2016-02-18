package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class RenameLocationPojo  implements RenameLocation {
	private TextSpanPojo textSpan ;
	private String fileName ;

	public RenameLocationPojo() {
	}

	public TextSpan textSpan() {
		return this.textSpan;
	}
	public String fileName() {
		return this.fileName;
	}
	public static Builder create(TextSpan textSpan, String fileName) {
		return new BuilderImpl(new RenameLocationPojo(), textSpan, fileName);
	}

	public static class BuilderImpl implements Builder {
		private final RenameLocationPojo pojo;

		BuilderImpl(RenameLocationPojo pojo, TextSpan textSpan, String fileName) {
			this.pojo = pojo;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.fileName = (String)fileName;
		}


		public RenameLocation build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "RenameLocation@"+hashCode()+"[textSpan = "+textSpan()+", fileName = "+fileName()+"]";
	}
}
