package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.SignatureHelpItem;

public class SignatureHelpItemPojo  implements SignatureHelpItem {
	private boolean isVariadic ;
	private java.util.List<SymbolDisplayPartPojo> prefixDisplayParts ;
	private java.util.List<SymbolDisplayPartPojo> suffixDisplayParts ;
	private java.util.List<SymbolDisplayPartPojo> separatorDisplayParts ;
	private java.util.List<SignatureHelpParameterPojo> parameters ;
	private java.util.List<SymbolDisplayPartPojo> documentation ;

	public SignatureHelpItemPojo() {
	}

	public boolean isVariadic() {
		return this.isVariadic;
	}
	public java.util.List<SymbolDisplayPartPojo> prefixDisplayParts() {
		return this.prefixDisplayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> suffixDisplayParts() {
		return this.suffixDisplayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> separatorDisplayParts() {
		return this.separatorDisplayParts;
	}
	public java.util.List<SignatureHelpParameterPojo> parameters() {
		return this.parameters;
	}
	public java.util.List<SymbolDisplayPartPojo> documentation() {
		return this.documentation;
	}

	public String toString() {
		return "SignatureHelpItem@"+hashCode()+"[isVariadic = "+isVariadic()+", prefixDisplayParts = "+prefixDisplayParts()+", suffixDisplayParts = "+suffixDisplayParts()+", separatorDisplayParts = "+separatorDisplayParts()+", parameters = "+parameters()+", documentation = "+documentation()+"]";
	}
}
