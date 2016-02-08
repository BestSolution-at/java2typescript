package at.bestsolution.typescript.service.api.model;

public interface FormatCodeOptions extends EditorOptions {
	public boolean InsertSpaceAfterCommaDelimiter();
	public boolean InsertSpaceAfterSemicolonInForStatements();
	public boolean InsertSpaceBeforeAndAfterBinaryOperators();
	public boolean InsertSpaceAfterKeywordsInControlFlowStatements();
	public boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions();
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis();
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets();
	public boolean PlaceOpenBraceOnNewLineForFunctions();
	public boolean PlaceOpenBraceOnNewLineForControlBlocks();
}
