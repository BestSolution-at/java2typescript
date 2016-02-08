package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.ReferencedSymbol;

public class ReferencedSymbolPojo  implements ReferencedSymbol {
	private DefinitionInfoPojo definition ;
	private java.util.List<ReferenceEntryPojo> references ;

	public ReferencedSymbolPojo() {
	}

	public DefinitionInfoPojo definition() {
		return this.definition;
	}
	public java.util.List<ReferenceEntryPojo> references() {
		return this.references;
	}

	public String toString() {
		return "ReferencedSymbol@"+hashCode()+"[definition = "+definition()+", references = "+references()+"]";
	}
}
