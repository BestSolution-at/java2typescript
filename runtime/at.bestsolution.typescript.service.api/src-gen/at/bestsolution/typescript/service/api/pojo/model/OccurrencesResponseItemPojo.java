package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.OccurrencesResponseItem;

public class OccurrencesResponseItemPojo extends FileSpanPojo implements OccurrencesResponseItem {
	private boolean isWriteAccess ;

	public OccurrencesResponseItemPojo() {
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
