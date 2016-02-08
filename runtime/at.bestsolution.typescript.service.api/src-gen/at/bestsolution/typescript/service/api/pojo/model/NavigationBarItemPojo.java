package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.NavigationBarItem;

public class NavigationBarItemPojo  implements NavigationBarItem {
	private String text ;
	private String kind  = "";
	private at.bestsolution.typescript.service.api.model.ScriptElementKind _kind = null;
	private String kindModifiers  = "";
	private java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> _kindModifiers = null;
	private java.util.List<TextSpanPojo> spans ;
	private java.util.List<NavigationBarItemPojo> childItems ;
	private int indent ;
	private boolean bolded ;
	private boolean grayed ;

	public NavigationBarItemPojo() {
	}

	public String text() {
		return this.text;
	}
	public at.bestsolution.typescript.service.api.model.ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromStringValue(this.kind);
	}
	public java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromStringValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public java.util.List<TextSpanPojo> spans() {
		return this.spans;
	}
	public java.util.List<NavigationBarItemPojo> childItems() {
		return this.childItems;
	}
	public int indent() {
		return this.indent;
	}
	public boolean bolded() {
		return this.bolded;
	}
	public boolean grayed() {
		return this.grayed;
	}

	public String toString() {
		return "NavigationBarItem@"+hashCode()+"[text = "+text()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", spans = "+spans()+", childItems = "+childItems()+", indent = "+indent()+", bolded = "+bolded()+", grayed = "+grayed()+"]";
	}
}
