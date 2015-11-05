package at.bestsolution.typescript.service.api.model;

public interface NavtoItem  {
	public String getName();
	public String getKind();
	public String getMatchKind();
	public boolean getIsCaseSensitive();
	public String getKindModifiers();
	public String getFile();
	public Location getStart();
	public Location getEnd();
	public String getContainerName();
	public String getContainerKind();
}
