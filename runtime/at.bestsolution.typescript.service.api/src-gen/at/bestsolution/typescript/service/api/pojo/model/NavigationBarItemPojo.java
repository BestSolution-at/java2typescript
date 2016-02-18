package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
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
	public ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromValue(this.kind);
	}
	public java.util.List<ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public java.util.List<TextSpan> spans() {
		return (java.util.List<TextSpan>)((java.util.List<?>)this.spans);
	}
	public java.util.List<NavigationBarItem> childItems() {
		return (java.util.List<NavigationBarItem>)((java.util.List<?>)this.childItems);
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
	public static Builder create(String text, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<TextSpan> spans, java.util.List<NavigationBarItem> childItems, int indent, boolean bolded, boolean grayed) {
		return new BuilderImpl(new NavigationBarItemPojo(), text, kind, kindModifiers, spans, childItems, indent, bolded, grayed);
	}

	public static class BuilderImpl implements Builder {
		private final NavigationBarItemPojo pojo;

		BuilderImpl(NavigationBarItemPojo pojo, String text, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<TextSpan> spans, java.util.List<NavigationBarItem> childItems, int indent, boolean bolded, boolean grayed) {
			this.pojo = pojo;
			this.pojo.text = (String)text;
			this.pojo._kind = kind;
			this.pojo.kind = kind.asValue();
			this.pojo._kindModifiers = kindModifiers;
			this.pojo.kindModifiers = kindModifiers.stream().map( v -> v.asValue() ).collect( java.util.stream.Collectors.joining(",") );
			this.pojo.spans = (java.util.List<TextSpanPojo>)(java.util.List<?>)spans;
			this.pojo.childItems = (java.util.List<NavigationBarItemPojo>)(java.util.List<?>)childItems;
			this.pojo.indent = (int)indent;
			this.pojo.bolded = (boolean)bolded;
			this.pojo.grayed = (boolean)grayed;
		}


		public NavigationBarItem build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "NavigationBarItem@"+hashCode()+"[text = "+text()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", spans = "+spans()+", childItems = "+childItems()+", indent = "+indent()+", bolded = "+bolded()+", grayed = "+grayed()+"]";
	}
}
