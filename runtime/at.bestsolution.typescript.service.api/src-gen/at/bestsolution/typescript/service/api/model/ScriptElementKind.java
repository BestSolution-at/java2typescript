package at.bestsolution.typescript.service.api.model;

public enum ScriptElementKind {
	UNKNOWN("")
	, WARNING("warning")
	, KEYWORD("keyword")
	, SCRIPT_ELEMENT("script")
	, MODULE_ELEMENT("module")
	, CLASS_ELEMENT("class")
	, LOCAL_CLASS_ELEMENT("local class")
	, INTERFACE_ELEMENT("interface")
	, TYPE_ELEMENT("type")
	, ENUM_ELEMENT("enum")
	, VARIABLE_ELEMENT("var")
	, LOCAL_VARIABLE_ELEMENT("local var")
	, FUNCTION_ELEMENT("function")
	, LOCAL_FUNCTION_ELEMENT("local function")
	, MEMBER_FUNCTION_ELEMENT("method")
	, MEMBER_GET_ACCESSOR_ELEMENT("getter")
	, MEMBER_SET_ACCESSOR_ELEMENT("setter")
	, MEMBER_VARIABLE_ELEMENT("property")
	, CONSTRUCTOR_IMPLEMENTATION_ELEMENT("constructor")
	, CALL_SIGNATURE_ELEMENT("call")
	, INDEX_SIGNATURE_ELEMENT("index")
	, CONSTRUCT_SIGNATURE_ELEMENT("construct")
	, PARAMETER_ELEMENT("parameter")
	, TYPE_PARAMETER_ELEMENT("type parameter")
	, PRIMITIVE_TYPE("primitive type")
	, LABEL("label")
	, ALIAS("alias")
	, CONST_ELEMENT("const")
	, LET_ELEMENT("let");

	private final String value;

	ScriptElementKind(String value) {
		this.value = value;
	}

	public String asValue() {
		return this.value;
	}

	public static ScriptElementKind fromValue(String value) {
		switch( value ) {
			case "": return UNKNOWN;
			case "warning": return WARNING;
			case "keyword": return KEYWORD;
			case "script": return SCRIPT_ELEMENT;
			case "module": return MODULE_ELEMENT;
			case "class": return CLASS_ELEMENT;
			case "local class": return LOCAL_CLASS_ELEMENT;
			case "interface": return INTERFACE_ELEMENT;
			case "type": return TYPE_ELEMENT;
			case "enum": return ENUM_ELEMENT;
			case "var": return VARIABLE_ELEMENT;
			case "local var": return LOCAL_VARIABLE_ELEMENT;
			case "function": return FUNCTION_ELEMENT;
			case "local function": return LOCAL_FUNCTION_ELEMENT;
			case "method": return MEMBER_FUNCTION_ELEMENT;
			case "getter": return MEMBER_GET_ACCESSOR_ELEMENT;
			case "setter": return MEMBER_SET_ACCESSOR_ELEMENT;
			case "property": return MEMBER_VARIABLE_ELEMENT;
			case "constructor": return CONSTRUCTOR_IMPLEMENTATION_ELEMENT;
			case "call": return CALL_SIGNATURE_ELEMENT;
			case "index": return INDEX_SIGNATURE_ELEMENT;
			case "construct": return CONSTRUCT_SIGNATURE_ELEMENT;
			case "parameter": return PARAMETER_ELEMENT;
			case "type parameter": return TYPE_PARAMETER_ELEMENT;
			case "primitive type": return PRIMITIVE_TYPE;
			case "label": return LABEL;
			case "alias": return ALIAS;
			case "const": return CONST_ELEMENT;
			case "let": return LET_ELEMENT;
			default:
				return UNKNOWN;
		}
	}
}
