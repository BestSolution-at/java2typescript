package at.bestsolution.typescript.service.api.model;

public interface FormatCodeOptions  {
	public int IndentSize();
	public int TabSize();
	public String NewLineCharacter();
	public boolean ConvertTabsToSpaces();
	public IndentStyle IndentStyle();
	public boolean InsertSpaceAfterCommaDelimiter();
	public boolean InsertSpaceAfterSemicolonInForStatements();
	public boolean InsertSpaceBeforeAndAfterBinaryOperators();
	public boolean InsertSpaceAfterKeywordsInControlFlowStatements();
	public boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions();
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis();
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets();
	public boolean PlaceOpenBraceOnNewLineForFunctions();
	public boolean PlaceOpenBraceOnNewLineForControlBlocks();

	public interface Builder {
		public FormatCodeOptions build();
	}
}
