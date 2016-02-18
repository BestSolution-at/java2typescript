package at.bestsolution.typescript.service.api.model;

public enum IndentStyle {
	NONE("None")
	, BLOCK("Block")
	, SMART("Smart");

	private final String value;

	IndentStyle(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static IndentStyle fromValue(String value) {
		switch( value ) {
			case "None": return NONE;
			case "Block": return BLOCK;
			case "Smart": return SMART;
			default:
				return NONE;
		}
	}
}
