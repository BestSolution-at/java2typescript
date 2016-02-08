package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.SignatureHelpParameter;

public class SignatureHelpParameterPojo  implements SignatureHelpParameter {
	private String name ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;
	private java.util.List<SymbolDisplayPartPojo> displayParts ;
	private boolean isOptional ;

	public SignatureHelpParameterPojo() {
	}

	public String name() {
		return this.name;
	}
	public java.util.List<SymbolDisplayPartPojo> documentation() {
		return this.documentation;
	}
	public java.util.List<SymbolDisplayPartPojo> displayParts() {
		return this.displayParts;
	}
	public boolean isOptional() {
		return this.isOptional;
	}

	public String toString() {
		return "SignatureHelpParameter@"+hashCode()+"[name = "+name()+", documentation = "+documentation()+", displayParts = "+displayParts()+", isOptional = "+isOptional()+"]";
	}
}
