package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class SignatureHelpParameter  {
	private String name ;
	private SymbolDisplayPart[] documentation ;
	private SymbolDisplayPart[] displayParts ;
	private boolean isOptional ;

	public SignatureHelpParameter() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public SymbolDisplayPart[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPart[] documentation) {
		this.documentation = documentation;
	}
	public SymbolDisplayPart[] getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(SymbolDisplayPart[] displayParts) {
		this.displayParts = displayParts;
	}
	public boolean getIsOptional() {
		return this.isOptional;
	}

	public void setIsOptional(boolean isOptional) {
		this.isOptional = isOptional;
	}

	public String toString() {
		return "SignatureHelpParameter@"+hashCode()+"[name = "+name+", documentation = "+documentation+", displayParts = "+displayParts+", isOptional = "+isOptional+"]";
	}
}
