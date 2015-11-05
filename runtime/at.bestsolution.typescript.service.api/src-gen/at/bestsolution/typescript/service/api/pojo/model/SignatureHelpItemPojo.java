package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SignatureHelpItem;

public class SignatureHelpItemPojo  implements SignatureHelpItem {
	private boolean isVariadic ;
	private SymbolDisplayPartPojo[] prefixDisplayParts ;
	private SymbolDisplayPartPojo[] suffixDisplayParts ;
	private SymbolDisplayPartPojo[] separatorDisplayParts ;
	private SignatureHelpParameterPojo[] parameters ;
	private SymbolDisplayPartPojo[] documentation ;

	public SignatureHelpItemPojo() {
	}

	public boolean getIsVariadic() {
		return this.isVariadic;
	}

	public void setIsVariadic(boolean isVariadic) {
		this.isVariadic = isVariadic;
	}
	public SymbolDisplayPartPojo[] getPrefixDisplayParts() {
		return this.prefixDisplayParts;
	}

	public void setPrefixDisplayParts(SymbolDisplayPartPojo[] prefixDisplayParts) {
		this.prefixDisplayParts = prefixDisplayParts;
	}
	public SymbolDisplayPartPojo[] getSuffixDisplayParts() {
		return this.suffixDisplayParts;
	}

	public void setSuffixDisplayParts(SymbolDisplayPartPojo[] suffixDisplayParts) {
		this.suffixDisplayParts = suffixDisplayParts;
	}
	public SymbolDisplayPartPojo[] getSeparatorDisplayParts() {
		return this.separatorDisplayParts;
	}

	public void setSeparatorDisplayParts(SymbolDisplayPartPojo[] separatorDisplayParts) {
		this.separatorDisplayParts = separatorDisplayParts;
	}
	public SignatureHelpParameterPojo[] getParameters() {
		return this.parameters;
	}

	public void setParameters(SignatureHelpParameterPojo[] parameters) {
		this.parameters = parameters;
	}
	public SymbolDisplayPartPojo[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPartPojo[] documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "SignatureHelpItem@"+hashCode()+"[isVariadic = "+isVariadic+", prefixDisplayParts = "+prefixDisplayParts+", suffixDisplayParts = "+suffixDisplayParts+", separatorDisplayParts = "+separatorDisplayParts+", parameters = "+parameters+", documentation = "+documentation+"]";
	}
}
