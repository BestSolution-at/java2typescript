package at.bestsolution.typescript.service.api.model;

public interface CodeEdit  {
	public Location getStart();
	public Location getEnd();
	public String getNewText();
}
