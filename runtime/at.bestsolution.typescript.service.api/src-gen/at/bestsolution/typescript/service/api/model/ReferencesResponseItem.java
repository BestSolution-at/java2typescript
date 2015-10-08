package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class ReferencesResponseItem extends FileSpan {
	private String lineText ;
	private boolean isWriteAccess ;

	public ReferencesResponseItem() {
	}

	public String getLineText() {
		return this.lineText;
	}

	public void setLineText(String lineText) {
		this.lineText = lineText;
	}
	public boolean getIsWriteAccess() {
		return this.isWriteAccess;
	}

	public void setIsWriteAccess(boolean isWriteAccess) {
		this.isWriteAccess = isWriteAccess;
	}

	public String toString() {
		return "ReferencesResponseItem@"+hashCode()+"[lineText = "+lineText+", isWriteAccess = "+isWriteAccess+"]";
	}
}
