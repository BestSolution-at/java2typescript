package at.bestsolution.typescript.service.api.model;

public enum SymbolDisplayPartKind {
	ALIAS_NAME("aliasName")
	, CLASS_NAME("className")
	, ENUM_NAME("enumName")
	, FIELD_NAME("fieldName")
	, INTERFACE_NAME("interfaceName")
	, KEYWORD("keyword")
	, LINE_BREAK("lineBreak")
	, NUMERIC_LITERAL("numericLiteral")
	, STRING_LITERAL("stringLiteral")
	, LOCAL_NAME("localName")
	, METHOD_NAME("methodName")
	, MODULE_NAME("moduleName")
	, OPERATOR("operator")
	, PARAMETER_NAME("parameterName")
	, PROPERTY_NAME("propertyName")
	, PUNCTUATION("punctuation")
	, SPACE("space")
	, TEXT("text")
	, TYPE_PARAMETER_NAME("typeParameterName")
	, ENUM_MEMBER_NAME("enumMemberName")
	, FUNCTION_NAME("functionName")
	, REGULAR_EXPRESSION_LITERAL("regularExpressionLiteral");

	private final String value;

	SymbolDisplayPartKind(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static SymbolDisplayPartKind fromValue(String value) {
		switch( value ) {
			case "aliasName": return ALIAS_NAME;
			case "className": return CLASS_NAME;
			case "enumName": return ENUM_NAME;
			case "fieldName": return FIELD_NAME;
			case "interfaceName": return INTERFACE_NAME;
			case "keyword": return KEYWORD;
			case "lineBreak": return LINE_BREAK;
			case "numericLiteral": return NUMERIC_LITERAL;
			case "stringLiteral": return STRING_LITERAL;
			case "localName": return LOCAL_NAME;
			case "methodName": return METHOD_NAME;
			case "moduleName": return MODULE_NAME;
			case "operator": return OPERATOR;
			case "parameterName": return PARAMETER_NAME;
			case "propertyName": return PROPERTY_NAME;
			case "punctuation": return PUNCTUATION;
			case "space": return SPACE;
			case "text": return TEXT;
			case "typeParameterName": return TYPE_PARAMETER_NAME;
			case "enumMemberName": return ENUM_MEMBER_NAME;
			case "functionName": return FUNCTION_NAME;
			case "regularExpressionLiteral": return REGULAR_EXPRESSION_LITERAL;
			default:
				return ALIAS_NAME;
		}
	}
}
