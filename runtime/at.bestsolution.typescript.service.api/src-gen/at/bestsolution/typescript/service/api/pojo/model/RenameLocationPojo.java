package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.RenameLocation;

public class RenameLocationPojo  implements RenameLocation {
	private TextSpanPojo textSpan ;
	private String fileName ;

	public RenameLocationPojo() {
	}

	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public String fileName() {
		return this.fileName;
	}

	public String toString() {
		return "RenameLocation@"+hashCode()+"[textSpan = "+textSpan()+", fileName = "+fileName()+"]";
	}
}
