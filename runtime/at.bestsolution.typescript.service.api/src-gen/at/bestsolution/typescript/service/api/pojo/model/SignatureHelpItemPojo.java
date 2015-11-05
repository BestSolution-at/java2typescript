package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
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

	public boolean getIsVariadic() {
		return this.isVariadic;
	}

	public void setIsVariadic(boolean isVariadic) {
		this.isVariadic = isVariadic;
	}
	public java.util.List<SymbolDisplayPartPojo> getPrefixDisplayParts() {
		return this.prefixDisplayParts;
	}

	public void setPrefixDisplayParts(java.util.List<SymbolDisplayPartPojo> prefixDisplayParts) {
		this.prefixDisplayParts = prefixDisplayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> getSuffixDisplayParts() {
		return this.suffixDisplayParts;
	}

	public void setSuffixDisplayParts(java.util.List<SymbolDisplayPartPojo> suffixDisplayParts) {
		this.suffixDisplayParts = suffixDisplayParts;
	}
	public java.util.List<SymbolDisplayPartPojo> getSeparatorDisplayParts() {
		return this.separatorDisplayParts;
	}

	public void setSeparatorDisplayParts(java.util.List<SymbolDisplayPartPojo> separatorDisplayParts) {
		this.separatorDisplayParts = separatorDisplayParts;
	}
	public java.util.List<SignatureHelpParameterPojo> getParameters() {
		return this.parameters;
	}

	public void setParameters(java.util.List<SignatureHelpParameterPojo> parameters) {
		this.parameters = parameters;
	}
	public java.util.List<SymbolDisplayPartPojo> getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(java.util.List<SymbolDisplayPartPojo> documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "SignatureHelpItem@"+hashCode()+"[isVariadic = "+isVariadic+", prefixDisplayParts = "+prefixDisplayParts+", suffixDisplayParts = "+suffixDisplayParts+", separatorDisplayParts = "+separatorDisplayParts+", parameters = "+parameters+", documentation = "+documentation+"]";
	}
}
