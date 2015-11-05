package at.bestsolution.typescript.service.api.model;

public interface NavigationBarItem  {
	public String getText();
	public String getKind();
	public String getKindModifiers();
	public TextSpan[] getSpans();
	public NavigationBarItem[] getChildItems();
}
