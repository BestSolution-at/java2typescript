package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class SymbolDisplayPartPojo  implements SymbolDisplayPart {
	private String text ;
		private String kind  = "aliasName";
	private at.bestsolution.typescript.service.api.model.SymbolDisplayPartKind _kind = null;

	public SymbolDisplayPartPojo() {
	}

	public String text() {
		return this.text;
	}
	public SymbolDisplayPartKind kind() {
		if( _kind != null ) return _kind;
		return _kind = at.bestsolution.typescript.service.api.model.SymbolDisplayPartKind.fromValue(this.kind);
	}
	public static Builder create(String text, SymbolDisplayPartKind kind) {
		return new BuilderImpl(new SymbolDisplayPartPojo(), text, kind);
	}

	public static class BuilderImpl implements Builder {
		private final SymbolDisplayPartPojo pojo;

		BuilderImpl(SymbolDisplayPartPojo pojo, String text, SymbolDisplayPartKind kind) {
			this.pojo = pojo;
			this.pojo.text = (String)text;
			this.pojo._kind = kind;
			this.pojo.kind = kind.asValue();
		}


		public SymbolDisplayPart build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "SymbolDisplayPart@"+hashCode()+"[text = "+text()+", kind = "+kind()+"]";
	}
}
