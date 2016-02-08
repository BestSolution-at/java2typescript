package at.bestsolution.typescript.service.api.model;

public interface CompletionEntry  {
	public String name();
	public ScriptElementKind kind();
	public java.util.List<? extends ScriptElementKindModifier> kindModifiers();
	public String sortText();
}
