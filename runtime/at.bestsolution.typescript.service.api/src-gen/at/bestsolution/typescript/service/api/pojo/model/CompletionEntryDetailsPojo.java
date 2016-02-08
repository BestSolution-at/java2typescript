package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.CompletionEntryDetails;

public class CompletionEntryDetailsPojo  implements CompletionEntryDetails {
	private String name ;
	private String kind  = "";
	private at.bestsolution.typescript.service.api.model.ScriptElementKind _kind = null;
	private String kindModifiers  = "";
	private java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> _kindModifiers = null;
	private java.util.List<SymbolDisplayPartPojo> displayParts ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;

	public CompletionEntryDetailsPojo() {
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
	public java.util.List<SymbolDisplayPartPojo> displayParts() {
		return this.displayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> documentation() {
		return this.documentation;
	}

	public String toString() {
		return "CompletionEntryDetails@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", displayParts = "+displayParts()+", documentation = "+documentation()+"]";
	}
}
