package at.bestsolution.typescript.service.api.model;

public interface RenameInfo  {
	public boolean canRename();
	public String localizedErrorMessage();
	public String displayName();
	public String fullDisplayName();
	public String kind();
	public String kindModifiers();
	public TextSpan triggerSpan();
}
