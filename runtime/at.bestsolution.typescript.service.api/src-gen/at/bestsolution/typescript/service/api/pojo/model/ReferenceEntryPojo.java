package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class ReferenceEntryPojo  implements ReferenceEntry {
	private TextSpanPojo textSpan ;
	private String fileName ;
	private boolean isWriteAccess ;

	public ReferenceEntryPojo() {
	}

	public TextSpan textSpan() {
		return this.textSpan;
	}
	public String fileName() {
		return this.fileName;
	}
	public boolean isWriteAccess() {
		return this.isWriteAccess;
	}
	public static Builder create(TextSpan textSpan, String fileName, boolean isWriteAccess) {
		return new BuilderImpl(new ReferenceEntryPojo(), textSpan, fileName, isWriteAccess);
	}

	public static class BuilderImpl implements Builder {
		private final ReferenceEntryPojo pojo;

		BuilderImpl(ReferenceEntryPojo pojo, TextSpan textSpan, String fileName, boolean isWriteAccess) {
			this.pojo = pojo;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.fileName = (String)fileName;
			this.pojo.isWriteAccess = (boolean)isWriteAccess;
		}


		public ReferenceEntry build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "ReferenceEntry@"+hashCode()+"[textSpan = "+textSpan()+", fileName = "+fileName()+", isWriteAccess = "+isWriteAccess()+"]";
	}
}
