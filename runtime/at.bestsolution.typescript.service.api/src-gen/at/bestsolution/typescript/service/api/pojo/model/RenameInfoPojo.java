package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.RenameInfo;

public class RenameInfoPojo  implements RenameInfo {
	private boolean canRename ;
	private String localizedErrorMessage ;
	private String displayName ;
	private String fullDisplayName ;
	private String kind ;
	private String kindModifiers ;
	private TextSpanPojo triggerSpan ;

	public RenameInfoPojo() {
	}

	public boolean canRename() {
		return this.canRename;
	}
	public String localizedErrorMessage() {
		return this.localizedErrorMessage;
	}
	public String displayName() {
		return this.displayName;
	}
	public String fullDisplayName() {
		return this.fullDisplayName;
	}
	public String kind() {
		return this.kind;
	}
	public String kindModifiers() {
		return this.kindModifiers;
	}
	public TextSpanPojo triggerSpan() {
		return this.triggerSpan;
	}

	public String toString() {
		return "RenameInfo@"+hashCode()+"[canRename = "+canRename()+", localizedErrorMessage = "+localizedErrorMessage()+", displayName = "+displayName()+", fullDisplayName = "+fullDisplayName()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", triggerSpan = "+triggerSpan()+"]";
	}
}
