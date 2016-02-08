package at.bestsolution.typescript.service.api.model;

public interface EditorOptions  {
	public int IndentSize();
	public int TabSize();
	public String NewLineCharacter();
	public boolean ConvertTabsToSpaces();
	public IndentStyle IndentStyle();
}
