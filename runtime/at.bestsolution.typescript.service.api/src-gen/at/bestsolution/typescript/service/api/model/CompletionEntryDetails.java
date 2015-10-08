package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class CompletionEntryDetails  {
	private String name ;
	private String kind ;
	private String kindModifiers ;
	private SymbolDisplayPart[] displayParts ;
	private SymbolDisplayPart[] documentation ;

	public CompletionEntryDetails() {
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
	public SymbolDisplayPart[] getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(SymbolDisplayPart[] displayParts) {
		this.displayParts = displayParts;
	}
	public SymbolDisplayPart[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPart[] documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "CompletionEntryDetails@"+hashCode()+"[name = "+name+", kind = "+kind+", kindModifiers = "+kindModifiers+", displayParts = "+displayParts+", documentation = "+documentation+"]";
	}
}
