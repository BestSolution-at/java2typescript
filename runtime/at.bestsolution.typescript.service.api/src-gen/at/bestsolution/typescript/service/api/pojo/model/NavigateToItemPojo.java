package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.NavigateToItem;

public class NavigateToItemPojo  implements NavigateToItem {
	private String name ;
	private String kind  = "";
	private at.bestsolution.typescript.service.api.model.ScriptElementKind _kind = null;
	private String kindModifiers  = "";
	private java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> _kindModifiers = null;
	private String matchKind  = "exact";
	private at.bestsolution.typescript.service.api.model.PatternMatchKind _matchKind = null;
	private boolean isCaseSensitive ;
	private String fileName ;
	private TextSpanPojo textSpan ;
	private String containerName ;
	private String containerKind ;

	public NavigateToItemPojo() {
	}

	public String name() {
		return this.name;
	}
	public at.bestsolution.typescript.service.api.model.ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromStringValue(this.kind);
	}
	public java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromStringValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public at.bestsolution.typescript.service.api.model.PatternMatchKind matchKind() {
		if( _matchKind != null ) return _matchKind;
		return _matchKind = at.bestsolution.typescript.service.api.model.PatternMatchKind.fromStringValue(this.matchKind);
	}
	public boolean isCaseSensitive() {
		return this.isCaseSensitive;
	}
	public String fileName() {
		return this.fileName;
	}
	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public String containerName() {
		return this.containerName;
	}
	public String containerKind() {
		return this.containerKind;
	}

	public String toString() {
		return "NavigateToItem@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", matchKind = "+matchKind()+", isCaseSensitive = "+isCaseSensitive()+", fileName = "+fileName()+", textSpan = "+textSpan()+", containerName = "+containerName()+", containerKind = "+containerKind()+"]";
	}
}
