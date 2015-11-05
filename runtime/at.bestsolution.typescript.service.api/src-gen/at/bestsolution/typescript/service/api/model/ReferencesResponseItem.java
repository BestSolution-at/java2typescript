package at.bestsolution.typescript.service.api.model;

public interface ReferencesResponseItem extends FileSpan {
	public String getLineText();
	public boolean getIsWriteAccess();
}
