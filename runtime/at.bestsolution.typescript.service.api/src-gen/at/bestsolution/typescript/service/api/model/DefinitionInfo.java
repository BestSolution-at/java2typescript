package at.bestsolution.typescript.service.api.model;

public interface DefinitionInfo  {
	public String fileName();
	public TextSpan textSpan();
	public String kind();
	public String name();
	public String containerKind();
	public String containerName();
}
