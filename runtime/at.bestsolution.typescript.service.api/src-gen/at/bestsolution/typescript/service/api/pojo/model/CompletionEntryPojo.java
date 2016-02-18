package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromValue(this.kind);
	}
	public java.util.List<ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public String sortText() {
		return this.sortText;
	}
	public static Builder create(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, String sortText) {
		return new BuilderImpl(new CompletionEntryPojo(), name, kind, kindModifiers, sortText);
	}

	public static class BuilderImpl implements Builder {
		private final CompletionEntryPojo pojo;

		BuilderImpl(CompletionEntryPojo pojo, String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, String sortText) {
			this.pojo = pojo;
			this.pojo.name = (String)name;
			this.pojo._kind = kind;
			this.pojo.kind = kind.asValue();
			this.pojo._kindModifiers = kindModifiers;
			this.pojo.kindModifiers = kindModifiers.stream().map( v -> v.asValue() ).collect( java.util.stream.Collectors.joining(",") );
			this.pojo.sortText = (String)sortText;
		}


		public CompletionEntry build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "CompletionEntry@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", sortText = "+sortText()+"]";
	}
}
