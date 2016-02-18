package at.bestsolution.typescript.service.api.model;

public enum PatternMatchKind {
	EXACT("exact")
	, PREFIX("prefix")
	, SUBSTRING("substring")
	, CAMELCASE("camelCase");

	private final String value;

	PatternMatchKind(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static PatternMatchKind fromValue(String value) {
		switch( value ) {
			case "exact": return EXACT;
			case "prefix": return PREFIX;
			case "substring": return SUBSTRING;
			case "camelCase": return CAMELCASE;
			default:
				return EXACT;
		}
	}
}
