package at.bestsolution.typescript.service.api.model;

public interface NavigateToItem  {
	public String name();
	public ScriptElementKind kind();
	public java.util.List<? extends ScriptElementKindModifier> kindModifiers();
	public PatternMatchKind matchKind();
	public boolean isCaseSensitive();
	public String fileName();
	public TextSpan textSpan();
	public String containerName();
	public String containerKind();
}
