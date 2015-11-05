package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.CompletionEntryDetails;

public class CompletionEntryDetailsPojo  implements CompletionEntryDetails {
	private String name ;
	private String kind ;
	private String kindModifiers ;
	private SymbolDisplayPartPojo[] displayParts ;
	private SymbolDisplayPartPojo[] documentation ;

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
	public SymbolDisplayPartPojo[] getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(SymbolDisplayPartPojo[] displayParts) {
		this.displayParts = displayParts;
	}
	public SymbolDisplayPartPojo[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPartPojo[] documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "CompletionEntryDetails@"+hashCode()+"[name = "+name+", kind = "+kind+", kindModifiers = "+kindModifiers+", displayParts = "+displayParts+", documentation = "+documentation+"]";
	}
}
