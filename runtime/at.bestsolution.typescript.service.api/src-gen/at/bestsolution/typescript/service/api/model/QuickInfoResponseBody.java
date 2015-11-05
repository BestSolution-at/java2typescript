package at.bestsolution.typescript.service.api.model;

public interface QuickInfoResponseBody  {
	public String getKind();
	public String getKindModifiers();
	public Location getStart();
	public Location getEnd();
	public String getDisplayString();
	public String getDocumentation();
}
