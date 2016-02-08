package at.bestsolution.typescript.service.api.model;

public interface NavigationBarItem  {
	public String text();
	public ScriptElementKind kind();
	public java.util.List<? extends ScriptElementKindModifier> kindModifiers();
	public java.util.List<? extends TextSpan> spans();
	public java.util.List<? extends NavigationBarItem> childItems();
	public int indent();
	public boolean bolded();
	public boolean grayed();
}
