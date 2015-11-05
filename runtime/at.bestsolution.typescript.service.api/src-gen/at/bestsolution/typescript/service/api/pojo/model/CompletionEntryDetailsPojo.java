package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.CompletionEntryDetails;

public class CompletionEntryDetailsPojo  implements CompletionEntryDetails {
	private String name ;
	private String kind ;
	private String kindModifiers ;
	private java.util.List<SymbolDisplayPartPojo> displayParts ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;

	public CompletionEntryDetailsPojo() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKindModifiers() {
		return this.kindModifiers;
	}

	public void setKindModifiers(String kindModifiers) {
		this.kindModifiers = kindModifiers;
	}
	public java.util.List<SymbolDisplayPartPojo> getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(java.util.List<SymbolDisplayPartPojo> displayParts) {
		this.displayParts = displayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(java.util.List<SymbolDisplayPartPojo> documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "CompletionEntryDetails@"+hashCode()+"[name = "+name+", kind = "+kind+", kindModifiers = "+kindModifiers+", displayParts = "+displayParts+", documentation = "+documentation+"]";
	}
}
