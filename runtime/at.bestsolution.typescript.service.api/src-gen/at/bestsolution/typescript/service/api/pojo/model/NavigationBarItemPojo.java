package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.NavigationBarItem;

public class NavigationBarItemPojo  implements NavigationBarItem {
	private String text ;
	private String kind ;
	private String kindModifiers ;
	private TextSpanPojo[] spans ;
	private NavigationBarItemPojo[] childItems ;

	public NavigationBarItemPojo() {
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
	public TextSpanPojo[] getSpans() {
		return this.spans;
	}

	public void setSpans(TextSpanPojo[] spans) {
		this.spans = spans;
	}
	public NavigationBarItemPojo[] getChildItems() {
		return this.childItems;
	}

	public void setChildItems(NavigationBarItemPojo[] childItems) {
		this.childItems = childItems;
	}

	public String toString() {
		return "NavigationBarItem@"+hashCode()+"[text = "+text+", kind = "+kind+", kindModifiers = "+kindModifiers+", spans = "+spans+", childItems = "+childItems+"]";
	}
}
