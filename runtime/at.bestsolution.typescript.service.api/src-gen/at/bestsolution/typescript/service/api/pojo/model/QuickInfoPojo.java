package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class QuickInfoPojo  implements QuickInfo {
	private String kind  = "";
	private at.bestsolution.typescript.service.api.model.ScriptElementKind _kind = null;
	private String kindModifiers  = "";
	private java.util.List<at.bestsolution.typescript.service.api.model.ScriptElementKindModifier> _kindModifiers = null;
	private TextSpanPojo textSpan ;
	private java.util.List<SymbolDisplayPartPojo> displayParts ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;

	public QuickInfoPojo() {
	}

	public ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromStringValue(this.kind);
	}
	public java.util.List<ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromStringValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public TextSpan textSpan() {
		return this.textSpan;
	}
	public java.util.List<SymbolDisplayPart> displayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.displayParts);
	}
	public java.util.List<SymbolDisplayPart> documentation() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.documentation);
	}
	public static Builder create(ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, TextSpan textSpan, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
		return new BuilderImpl(new QuickInfoPojo(), kind, kindModifiers, textSpan, displayParts, documentation);
	}

	public static class BuilderImpl implements Builder {
		private final QuickInfoPojo pojo;

		BuilderImpl(QuickInfoPojo pojo, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, TextSpan textSpan, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
			this.pojo = pojo;
			this.pojo._kind = kind;
			this.pojo._kindModifiers = kindModifiers;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.displayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)displayParts;
			this.pojo.documentation = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)documentation;
		}


		public QuickInfo build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "QuickInfo@"+hashCode()+"[kind = "+kind()+", kindModifiers = "+kindModifiers()+", textSpan = "+textSpan()+", displayParts = "+displayParts()+", documentation = "+documentation()+"]";
	}
}
