package at.bestsolution.typescript.service.api.model;

public enum IndentStyle {
	NONE("None")
	, BLOCK("Block")
	, SMART("Smart");

	private final String stringValue;

	IndentStyle(String stringValue) {
		this.stringValue = stringValue;
	}

	public String asStringValue() {
		return this.stringValue;
	}

	public static IndentStyle fromStringValue(String stringValue) {
		switch( stringValue ) {
			case "None": return NONE;
			case "Block": return BLOCK;
			case "Smart": return SMART;
			default:
				return NONE;
		}
	}
}
