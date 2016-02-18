package at.bestsolution.typescript.service.api.model;

public interface NavigationBarItem  {
	public String text();
	public ScriptElementKind kind();
	public java.util.List<ScriptElementKindModifier> kindModifiers();
	public java.util.List<TextSpan> spans();
	public java.util.List<NavigationBarItem> childItems();
	public int indent();
	public boolean bolded();
	public boolean grayed();

	public interface Builder {
		public NavigationBarItem build();
	}
}
