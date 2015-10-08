package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class OccurrencesResponseItem extends FileSpan {
	private boolean isWriteAccess ;

	public OccurrencesResponseItem() {
	}

	public boolean getIsWriteAccess() {
		return this.isWriteAccess;
	}

	public void setIsWriteAccess(boolean isWriteAccess) {
		this.isWriteAccess = isWriteAccess;
	}

	public String toString() {
		return "OccurrencesResponseItem@"+hashCode()+"[isWriteAccess = "+isWriteAccess+"]";
	}
}
