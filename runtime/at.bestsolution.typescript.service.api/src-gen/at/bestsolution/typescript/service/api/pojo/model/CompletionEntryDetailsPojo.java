package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
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
	public ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromValue(this.kind);
	}
	public java.util.List<ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public java.util.List<SymbolDisplayPart> displayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.displayParts);
	}
	public java.util.List<SymbolDisplayPart> documentation() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.documentation);
	}
	public static Builder create(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
		return new BuilderImpl(new CompletionEntryDetailsPojo(), name, kind, kindModifiers, displayParts, documentation);
	}

	public static class BuilderImpl implements Builder {
		private final CompletionEntryDetailsPojo pojo;

		BuilderImpl(CompletionEntryDetailsPojo pojo, String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
			this.pojo = pojo;
			this.pojo.name = (String)name;
			this.pojo._kind = kind;
			this.pojo.kind = kind.asValue();
			this.pojo._kindModifiers = kindModifiers;
			this.pojo.kindModifiers = kindModifiers.stream().map( v -> v.asValue() ).collect( java.util.stream.Collectors.joining(",") );
			this.pojo.displayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)displayParts;
			this.pojo.documentation = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)documentation;
		}


		public CompletionEntryDetails build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "CompletionEntryDetails@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", displayParts = "+displayParts()+", documentation = "+documentation()+"]";
	}
}
