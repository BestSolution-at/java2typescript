package at.bestsolution.typescript.service.api.model;

public enum DiagnosticCategory {
	WARNING("Warning")
	, ERROR("Error")
	, MESSAGE("Message");

	private final String value;

	DiagnosticCategory(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static DiagnosticCategory fromValue(String value) {
		switch( value ) {
			case "Warning": return WARNING;
			case "Error": return ERROR;
			case "Message": return MESSAGE;
			default:
				return WARNING;
		}
	}
}
