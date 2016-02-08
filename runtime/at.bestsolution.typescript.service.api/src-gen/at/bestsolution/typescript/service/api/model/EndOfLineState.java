package at.bestsolution.typescript.service.api.model;

public enum EndOfLineState {
	NONE("None")
	, IN_MULTILINE_COMMENT_TRIVIA("InMultiLineCommentTrivia")
	, IN_SINGLE_QUOTESTRING_LITERAL("InSingleQuoteStringLiteral")
	, IN_DOUBLE_QUOTESTRING_LITERAL("InDoubleQuoteStringLiteral")
	, IN_TEMPLATE_HEAD_OR_NO_SUBSTITUTION_TEMPLATE("InTemplateHeadOrNoSubstitutionTemplate")
	, IN_TEMPLATE_MIDDLE_OR_TAIL("InTemplateMiddleOrTail")
	, IN_TEMPLATE_SUBSTITUTION_POSITION("InTemplateSubstitutionPosition");

	private final String stringValue;

	EndOfLineState(String stringValue) {
		this.stringValue = stringValue;
	}

	public String asStringValue() {
		return this.stringValue;
	}

	public static EndOfLineState fromStringValue(String stringValue) {
		switch( stringValue ) {
			case "None": return NONE;
			case "InMultiLineCommentTrivia": return IN_MULTILINE_COMMENT_TRIVIA;
			case "InSingleQuoteStringLiteral": return IN_SINGLE_QUOTESTRING_LITERAL;
			case "InDoubleQuoteStringLiteral": return IN_DOUBLE_QUOTESTRING_LITERAL;
			case "InTemplateHeadOrNoSubstitutionTemplate": return IN_TEMPLATE_HEAD_OR_NO_SUBSTITUTION_TEMPLATE;
			case "InTemplateMiddleOrTail": return IN_TEMPLATE_MIDDLE_OR_TAIL;
			case "InTemplateSubstitutionPosition": return IN_TEMPLATE_SUBSTITUTION_POSITION;
			default:
				return NONE;
		}
	}
}
