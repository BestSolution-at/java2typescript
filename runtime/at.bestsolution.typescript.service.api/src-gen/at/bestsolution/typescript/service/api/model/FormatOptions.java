package at.bestsolution.typescript.service.api.model;

public interface FormatOptions  {
	public boolean getInsertSpaceAfterCommaDelimiter();
	public boolean getInsertSpaceAfterSemicolonInForStatements();
	public boolean getInsertSpaceBeforeAndAfterBinaryOperators();
	public boolean getInsertSpaceAfterKeywordsInControlFlowStatements();
	public boolean getInsertSpaceAfterFunctionKeywordForAnonymousFunctions();
	public boolean getInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis();
	public boolean getInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets();
	public boolean getPlaceOpenBraceOnNewLineForFunctions();
	public boolean getPlaceOpenBraceOnNewLineForControlBlocks();
}
