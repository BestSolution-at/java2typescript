package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
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
	public java.util.List<SymbolDisplayPart> prefixDisplayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.prefixDisplayParts);
	}
	public java.util.List<SymbolDisplayPart> suffixDisplayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.suffixDisplayParts);
	}
	public java.util.List<SymbolDisplayPart> separatorDisplayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.separatorDisplayParts);
	}
	public java.util.List<SignatureHelpParameter> parameters() {
		return (java.util.List<SignatureHelpParameter>)((java.util.List<?>)this.parameters);
	}
	public java.util.List<SymbolDisplayPart> documentation() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.documentation);
	}
	public static Builder create(boolean isVariadic, java.util.List<SymbolDisplayPart> prefixDisplayParts, java.util.List<SymbolDisplayPart> suffixDisplayParts, java.util.List<SymbolDisplayPart> separatorDisplayParts, java.util.List<SignatureHelpParameter> parameters, java.util.List<SymbolDisplayPart> documentation) {
		return new BuilderImpl(new SignatureHelpItemPojo(), isVariadic, prefixDisplayParts, suffixDisplayParts, separatorDisplayParts, parameters, documentation);
	}

	public static class BuilderImpl implements Builder {
		private final SignatureHelpItemPojo pojo;

		BuilderImpl(SignatureHelpItemPojo pojo, boolean isVariadic, java.util.List<SymbolDisplayPart> prefixDisplayParts, java.util.List<SymbolDisplayPart> suffixDisplayParts, java.util.List<SymbolDisplayPart> separatorDisplayParts, java.util.List<SignatureHelpParameter> parameters, java.util.List<SymbolDisplayPart> documentation) {
			this.pojo = pojo;
			this.pojo.isVariadic = (boolean)isVariadic;
			this.pojo.prefixDisplayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)prefixDisplayParts;
			this.pojo.suffixDisplayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)suffixDisplayParts;
			this.pojo.separatorDisplayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)separatorDisplayParts;
			this.pojo.parameters = (java.util.List<SignatureHelpParameterPojo>)(java.util.List<?>)parameters;
			this.pojo.documentation = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)documentation;
		}


		public SignatureHelpItem build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "SignatureHelpItem@"+hashCode()+"[isVariadic = "+isVariadic()+", prefixDisplayParts = "+prefixDisplayParts()+", suffixDisplayParts = "+suffixDisplayParts()+", separatorDisplayParts = "+separatorDisplayParts()+", parameters = "+parameters()+", documentation = "+documentation()+"]";
	}
}
