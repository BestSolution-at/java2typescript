package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class SignatureHelpItem  {
	private boolean isVariadic ;
	private SymbolDisplayPart[] prefixDisplayParts ;
	private SymbolDisplayPart[] suffixDisplayParts ;
	private SymbolDisplayPart[] separatorDisplayParts ;
	private SignatureHelpParameter[] parameters ;
	private SymbolDisplayPart[] documentation ;

	public SignatureHelpItem() {
	}

	public boolean getIsVariadic() {
		return this.isVariadic;
	}

	public void setIsVariadic(boolean isVariadic) {
		this.isVariadic = isVariadic;
	}
	public SymbolDisplayPart[] getPrefixDisplayParts() {
		return this.prefixDisplayParts;
	}

	public void setPrefixDisplayParts(SymbolDisplayPart[] prefixDisplayParts) {
		this.prefixDisplayParts = prefixDisplayParts;
	}
	public SymbolDisplayPart[] getSuffixDisplayParts() {
		return this.suffixDisplayParts;
	}

	public void setSuffixDisplayParts(SymbolDisplayPart[] suffixDisplayParts) {
		this.suffixDisplayParts = suffixDisplayParts;
	}
	public SymbolDisplayPart[] getSeparatorDisplayParts() {
		return this.separatorDisplayParts;
	}

	public void setSeparatorDisplayParts(SymbolDisplayPart[] separatorDisplayParts) {
		this.separatorDisplayParts = separatorDisplayParts;
	}
	public SignatureHelpParameter[] getParameters() {
		return this.parameters;
	}

	public void setParameters(SignatureHelpParameter[] parameters) {
		this.parameters = parameters;
	}
	public SymbolDisplayPart[] getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(SymbolDisplayPart[] documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "SignatureHelpItem@"+hashCode()+"[isVariadic = "+isVariadic+", prefixDisplayParts = "+prefixDisplayParts+", suffixDisplayParts = "+suffixDisplayParts+", separatorDisplayParts = "+separatorDisplayParts+", parameters = "+parameters+", documentation = "+documentation+"]";
	}
}
