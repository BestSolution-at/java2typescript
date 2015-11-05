package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SignatureHelpParameter;

public class SignatureHelpParameterPojo  implements SignatureHelpParameter {
	private String name ;
	private SymbolDisplayPartPojo[] documentation ;
	private SymbolDisplayPartPojo[] displayParts ;
	private boolean isOptional ;

	public SignatureHelpParameterPojo() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public SymbolDisplayPartPojo[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPartPojo[] documentation) {
		this.documentation = documentation;
	}
	public SymbolDisplayPartPojo[] getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(SymbolDisplayPartPojo[] displayParts) {
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
