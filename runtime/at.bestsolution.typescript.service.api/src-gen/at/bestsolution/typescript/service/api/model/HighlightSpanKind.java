package at.bestsolution.typescript.service.api.model;

public enum HighlightSpanKind {
	NONE("none")
	, DEFINITION("definition")
	, REFERENCE("reference")
	, WRITTEN_REFERENCE("writtenReference");

	private final String value;

	HighlightSpanKind(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static HighlightSpanKind fromValue(String value) {
		switch( value ) {
			case "none": return NONE;
			case "definition": return DEFINITION;
			case "reference": return REFERENCE;
			case "writtenReference": return WRITTEN_REFERENCE;
			default:
				return NONE;
		}
	}
}
