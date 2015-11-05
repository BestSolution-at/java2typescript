package at.bestsolution.typescript.service.api.model;

public interface NavigationBarItem  {
	public String getText();
	public String getKind();
	public String getKindModifiers();
	public java.util.List<? extends TextSpan> getSpans();
	public java.util.List<? extends NavigationBarItem> getChildItems();
}
