package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.ReferenceEntry;

public class ReferenceEntryPojo  implements ReferenceEntry {
	private TextSpanPojo textSpan ;
	private String fileName ;
	private boolean isWriteAccess ;

	public ReferenceEntryPojo() {
	}

	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public String fileName() {
		return this.fileName;
	}
	public boolean isWriteAccess() {
		return this.isWriteAccess;
	}

	public String toString() {
		return "ReferenceEntry@"+hashCode()+"[textSpan = "+textSpan()+", fileName = "+fileName()+", isWriteAccess = "+isWriteAccess()+"]";
	}
}
