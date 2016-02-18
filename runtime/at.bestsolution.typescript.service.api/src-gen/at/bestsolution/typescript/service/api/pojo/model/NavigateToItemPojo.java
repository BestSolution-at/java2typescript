package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public ScriptElementKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.ScriptElementKind.fromValue(this.kind);
	}
	public java.util.List<ScriptElementKindModifier> kindModifiers() {
		if( _kindModifiers != null ) return _kindModifiers;
		return _kindModifiers = java.util.stream.Stream.of(kindModifiers.split(",")).map( s -> at.bestsolution.typescript.service.api.model.ScriptElementKindModifier.fromValue(s) ).collect( java.util.stream.Collectors.toList() );
	}
	public PatternMatchKind matchKind() {
		if( _matchKind != null ) return _matchKind;
		return _matchKind = at.bestsolution.typescript.service.api.model.PatternMatchKind.fromValue(this.matchKind);
	}
	public boolean isCaseSensitive() {
		return this.isCaseSensitive;
	}
	public String fileName() {
		return this.fileName;
	}
	public TextSpan textSpan() {
		return this.textSpan;
	}
	public String containerName() {
		return this.containerName;
	}
	public String containerKind() {
		return this.containerKind;
	}
	public static Builder create(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, PatternMatchKind matchKind, boolean isCaseSensitive, String fileName, TextSpan textSpan, String containerName, String containerKind) {
		return new BuilderImpl(new NavigateToItemPojo(), name, kind, kindModifiers, matchKind, isCaseSensitive, fileName, textSpan, containerName, containerKind);
	}

	public static class BuilderImpl implements Builder {
		private final NavigateToItemPojo pojo;

		BuilderImpl(NavigateToItemPojo pojo, String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, PatternMatchKind matchKind, boolean isCaseSensitive, String fileName, TextSpan textSpan, String containerName, String containerKind) {
			this.pojo = pojo;
			this.pojo.name = (String)name;
			this.pojo._kind = kind;
			this.pojo.kind = kind.asValue();
			this.pojo._kindModifiers = kindModifiers;
			this.pojo.kindModifiers = kindModifiers.stream().map( v -> v.asValue() ).collect( java.util.stream.Collectors.joining(",") );
			this.pojo._matchKind = matchKind;
			this.pojo.matchKind = matchKind.asValue();
			this.pojo.isCaseSensitive = (boolean)isCaseSensitive;
			this.pojo.fileName = (String)fileName;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.containerName = (String)containerName;
			this.pojo.containerKind = (String)containerKind;
		}


		public NavigateToItem build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "NavigateToItem@"+hashCode()+"[name = "+name()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", matchKind = "+matchKind()+", isCaseSensitive = "+isCaseSensitive()+", fileName = "+fileName()+", textSpan = "+textSpan()+", containerName = "+containerName()+", containerKind = "+containerKind()+"]";
	}
}
