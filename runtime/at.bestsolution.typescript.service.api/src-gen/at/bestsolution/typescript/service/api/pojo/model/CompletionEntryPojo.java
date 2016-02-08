package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.CompletionEntry;

public class CompletionEntryPojo  implements CompletionEntry {
	private String name ;
	private String kind  = "";
	private at.bestsolution.typescript.service.api.model.ScriptElementKind _kind = null;
	private String kindModifiers  = "";
	private java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> _kindModifiers = null;
	private String sortText ;

	public CompletionEntryPojo() {
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
	public String sortText() {
		return this.sortText;
	}

	public String toString() {
		return "CompletionEntry@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", sortText = "+sortText()+"]";
	}
}
