package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SignatureHelpParameter;

public class SignatureHelpParameterPojo  implements SignatureHelpParameter {
	private String name ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;
	private java.util.List<SymbolDisplayPartPojo> displayParts ;
	private boolean isOptional ;

	public SignatureHelpParameterPojo() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public java.util.List<SymbolDisplayPartPojo> getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(java.util.List<SymbolDisplayPartPojo> documentation) {
		this.documentation = documentation;
	}
	public java.util.List<SymbolDisplayPartPojo> getDisplayParts() {
		return this.displayParts;
	}

	public void setDisplayParts(java.util.List<SymbolDisplayPartPojo> displayParts) {
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
