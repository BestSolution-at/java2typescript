package at.bestsolution.typescript.service.api.model;

public enum DiagnosticCategory {
	WARNING("Warning")
	, ERROR("Error")
	, MESSAGE("Message");

	private final String stringValue;

	DiagnosticCategory(String stringValue) {
		this.stringValue = stringValue;
	}

	public String asStringValue() {
		return this.stringValue;
	}

	public static DiagnosticCategory fromStringValue(String stringValue) {
		switch( stringValue ) {
			case "Warning": return WARNING;
			case "Error": return ERROR;
			case "Message": return MESSAGE;
			default:
				return WARNING;
		}
	}
}
