package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
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
	public java.util.List<SymbolDisplayPart> documentation() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.documentation);
	}
	public java.util.List<SymbolDisplayPart> displayParts() {
		return (java.util.List<SymbolDisplayPart>)((java.util.List<?>)this.displayParts);
	}
	public boolean isOptional() {
		return this.isOptional;
	}
	public static Builder create(String name, java.util.List<SymbolDisplayPart> documentation, java.util.List<SymbolDisplayPart> displayParts, boolean isOptional) {
		return new BuilderImpl(new SignatureHelpParameterPojo(), name, documentation, displayParts, isOptional);
	}

	public static class BuilderImpl implements Builder {
		private final SignatureHelpParameterPojo pojo;

		BuilderImpl(SignatureHelpParameterPojo pojo, String name, java.util.List<SymbolDisplayPart> documentation, java.util.List<SymbolDisplayPart> displayParts, boolean isOptional) {
			this.pojo = pojo;
			this.pojo.name = (String)name;
			this.pojo.documentation = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)documentation;
			this.pojo.displayParts = (java.util.List<SymbolDisplayPartPojo>)(java.util.List<?>)displayParts;
			this.pojo.isOptional = (boolean)isOptional;
		}


		public SignatureHelpParameter build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "SignatureHelpParameter@"+hashCode()+"[name = "+name()+", documentation = "+documentation()+", displayParts = "+displayParts()+", isOptional = "+isOptional()+"]";
	}
}
