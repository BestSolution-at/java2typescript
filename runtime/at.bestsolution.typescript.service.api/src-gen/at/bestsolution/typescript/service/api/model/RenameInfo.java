package at.bestsolution.typescript.service.api.model;

public interface RenameInfo  {
	public boolean getCanRename();
	public String getLocalizedErrorMessage();
	public String getDisplayName();
	public String getFullDisplayName();
	public String getKind();
	public String getKindModifiers();
}
