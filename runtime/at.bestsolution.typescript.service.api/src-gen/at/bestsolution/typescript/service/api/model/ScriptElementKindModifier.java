package at.bestsolution.typescript.service.api.model;

public enum ScriptElementKindModifier {
	NONE("")
	, PUBLIC_MEMBER_MODIFIER("public")
	, PRIVATE_MEMBER_MODIFIER("private")
	, PROTECTED_MEMBER_MODIFIER("protected")
	, EXPORTED_MODIFIER("export")
	, AMBIENT_MODIFIER("declare")
	, STATIC_MODIFIER("static")
	, ABSTRACT_MODIFIER("abstract");

	private final String value;

	ScriptElementKindModifier(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static ScriptElementKindModifier fromValue(String value) {
		switch( value ) {
			case "": return NONE;
			case "public": return PUBLIC_MEMBER_MODIFIER;
			case "private": return PRIVATE_MEMBER_MODIFIER;
			case "protected": return PROTECTED_MEMBER_MODIFIER;
			case "export": return EXPORTED_MODIFIER;
			case "declare": return AMBIENT_MODIFIER;
			case "static": return STATIC_MODIFIER;
			case "abstract": return ABSTRACT_MODIFIER;
			default:
				return NONE;
		}
	}
}
