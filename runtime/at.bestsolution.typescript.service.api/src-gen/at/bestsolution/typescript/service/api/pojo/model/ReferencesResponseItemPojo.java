package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.ReferencesResponseItem;

public class ReferencesResponseItemPojo extends FileSpanPojo implements ReferencesResponseItem {
	private String lineText ;
	private boolean isWriteAccess ;

	public ReferencesResponseItemPojo() {
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
