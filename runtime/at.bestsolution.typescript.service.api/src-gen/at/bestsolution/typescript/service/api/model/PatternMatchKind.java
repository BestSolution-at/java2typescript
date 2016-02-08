package at.bestsolution.typescript.service.api.model;

public enum PatternMatchKind {
	EXACT("exact")
	, PREFIX("prefix")
	, SUBSTRING("substring")
	, CAMELCASE("camelCase");

	private final String stringValue;

	PatternMatchKind(String stringValue) {
		this.stringValue = stringValue;
	}

	public String asStringValue() {
		return this.stringValue;
	}

	public static PatternMatchKind fromStringValue(String stringValue) {
		switch( stringValue ) {
			case "exact": return EXACT;
			case "prefix": return PREFIX;
			case "substring": return SUBSTRING;
			case "camelCase": return CAMELCASE;
			default:
				return EXACT;
		}
	}
}
