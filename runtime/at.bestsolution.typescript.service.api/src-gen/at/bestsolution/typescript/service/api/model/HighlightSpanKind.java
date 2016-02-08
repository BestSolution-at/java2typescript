package at.bestsolution.typescript.service.api.model;

public enum HighlightSpanKind {
	NONE("none")
	, DEFINITION("definition")
	, REFERENCE("reference")
	, WRITTEN_REFERENCE("writtenReference");

	private final String stringValue;

	HighlightSpanKind(String stringValue) {
		this.stringValue = stringValue;
	}

	public String asStringValue() {
		return this.stringValue;
	}

	public static HighlightSpanKind fromStringValue(String stringValue) {
		switch( stringValue ) {
			case "none": return NONE;
			case "definition": return DEFINITION;
			case "reference": return REFERENCE;
			case "writtenReference": return WRITTEN_REFERENCE;
			default:
				return NONE;
		}
	}
}
