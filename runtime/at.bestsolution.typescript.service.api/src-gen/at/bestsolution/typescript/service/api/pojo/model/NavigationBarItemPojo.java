package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.NavigationBarItem;

public class NavigationBarItemPojo  implements NavigationBarItem {
	private String text ;
	private String kind ;
	private String kindModifiers ;
	private java.util.List<TextSpanPojo> spans ;
	private java.util.List<NavigationBarItemPojo> childItems ;

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
	public java.util.List<TextSpanPojo> getSpans() {
		return this.spans;
	}

	public void setSpans(java.util.List<TextSpanPojo> spans) {
		this.spans = spans;
	}
	public java.util.List<NavigationBarItemPojo> getChildItems() {
		return this.childItems;
	}

	public void setChildItems(java.util.List<NavigationBarItemPojo> childItems) {
		this.childItems = childItems;
	}

	public String toString() {
		return "NavigationBarItem@"+hashCode()+"[text = "+text+", kind = "+kind+", kindModifiers = "+kindModifiers+", spans = "+spans+", childItems = "+childItems+"]";
	}
}
