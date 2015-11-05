package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.RenameInfo;

public class RenameInfoPojo  implements RenameInfo {
	private boolean canRename ;
	private String localizedErrorMessage ;
	private String displayName ;
	private String fullDisplayName ;
	private String kind ;
	private String kindModifiers ;

	public RenameInfoPojo() {
	}

	public boolean getCanRename() {
		return this.canRename;
	}

	public void setCanRename(boolean canRename) {
		this.canRename = canRename;
	}
	public String getLocalizedErrorMessage() {
		return this.localizedErrorMessage;
	}

	public void setLocalizedErrorMessage(String localizedErrorMessage) {
		this.localizedErrorMessage = localizedErrorMessage;
	}
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFullDisplayName() {
		return this.fullDisplayName;
	}

	public void setFullDisplayName(String fullDisplayName) {
		this.fullDisplayName = fullDisplayName;
	}
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKindModifiers() {
		return this.kindModifiers;
	}

	public void setKindModifiers(String kindModifiers) {
		this.kindModifiers = kindModifiers;
	}

	public String toString() {
		return "RenameInfo@"+hashCode()+"[canRename = "+canRename+", localizedErrorMessage = "+localizedErrorMessage+", displayName = "+displayName+", fullDisplayName = "+fullDisplayName+", kind = "+kind+", kindModifiers = "+kindModifiers+"]";
	}
}
