package at.bestsolution.typescript.service.api.model;

public interface Diagnostic  {
	public Location getStart();
	public Location getEnd();
	public String getText();
}
