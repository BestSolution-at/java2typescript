package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class NavigationBarItem  {
	private String text ;
	private String kind ;
	private String kindModifiers ;
	private TextSpan[] spans ;
	private NavigationBarItem[] childItems ;

	public NavigationBarItem() {
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKindModifiers() {
		return this.kindModifiers;
	}

	public void setKindModifiers(String kindModifiers) {
		this.kindModifiers = kindModifiers;
	}
	public TextSpan[] getSpans() {
		return this.spans;
	}

	public void setSpans(TextSpan[] spans) {
		this.spans = spans;
	}
	public NavigationBarItem[] getChildItems() {
		return this.childItems;
	}

	public void setChildItems(NavigationBarItem[] childItems) {
		this.childItems = childItems;
	}

	public String toString() {
		return "NavigationBarItem@"+hashCode()+"[text = "+text+", kind = "+kind+", kindModifiers = "+kindModifiers+", spans = "+spans+", childItems = "+childItems+"]";
	}
}
