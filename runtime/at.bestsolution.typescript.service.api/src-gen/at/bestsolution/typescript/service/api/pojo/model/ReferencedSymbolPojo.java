package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class ReferencedSymbolPojo  implements ReferencedSymbol {
	private DefinitionInfoPojo definition ;
	private java.util.List<ReferenceEntryPojo> references ;

	public ReferencedSymbolPojo() {
	}

	public DefinitionInfo definition() {
		return this.definition;
	}
	public java.util.List<ReferenceEntry> references() {
		return (java.util.List<ReferenceEntry>)((java.util.List<?>)this.references);
	}
	public static Builder create(DefinitionInfo definition, java.util.List<ReferenceEntry> references) {
		return new BuilderImpl(new ReferencedSymbolPojo(), definition, references);
	}

	public static class BuilderImpl implements Builder {
		private final ReferencedSymbolPojo pojo;

		BuilderImpl(ReferencedSymbolPojo pojo, DefinitionInfo definition, java.util.List<ReferenceEntry> references) {
			this.pojo = pojo;
			this.pojo.definition = (DefinitionInfoPojo)definition;
			this.pojo.references = (java.util.List<ReferenceEntryPojo>)(java.util.List<?>)references;
		}


		public ReferencedSymbol build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "ReferencedSymbol@"+hashCode()+"[definition = "+definition()+", references = "+references()+"]";
	}
}
