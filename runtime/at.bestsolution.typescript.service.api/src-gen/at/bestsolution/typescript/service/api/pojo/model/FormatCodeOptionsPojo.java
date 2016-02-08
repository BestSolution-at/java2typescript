package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.FormatCodeOptions;

public class FormatCodeOptionsPojo extends EditorOptionsPojo implements FormatCodeOptions {
	private boolean InsertSpaceAfterCommaDelimiter ;
	private boolean InsertSpaceAfterSemicolonInForStatements ;
	private boolean InsertSpaceBeforeAndAfterBinaryOperators ;
	private boolean InsertSpaceAfterKeywordsInControlFlowStatements ;
	private boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions ;
	private boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ;
	private boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ;
	private boolean PlaceOpenBraceOnNewLineForFunctions ;
	private boolean PlaceOpenBraceOnNewLineForControlBlocks ;

	public FormatCodeOptionsPojo() {
	}

	public boolean InsertSpaceAfterCommaDelimiter() {
		return this.InsertSpaceAfterCommaDelimiter;
	}
	public boolean InsertSpaceAfterSemicolonInForStatements() {
		return this.InsertSpaceAfterSemicolonInForStatements;
	}
	public boolean InsertSpaceBeforeAndAfterBinaryOperators() {
		return this.InsertSpaceBeforeAndAfterBinaryOperators;
	}
	public boolean InsertSpaceAfterKeywordsInControlFlowStatements() {
		return this.InsertSpaceAfterKeywordsInControlFlowStatements;
	}
	public boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions() {
		return this.InsertSpaceAfterFunctionKeywordForAnonymousFunctions;
	}
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis() {
		return this.InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;
	}
	public boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets() {
		return this.InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets;
	}
	public boolean PlaceOpenBraceOnNewLineForFunctions() {
		return this.PlaceOpenBraceOnNewLineForFunctions;
	}
	public boolean PlaceOpenBraceOnNewLineForControlBlocks() {
		return this.PlaceOpenBraceOnNewLineForControlBlocks;
	}

	public String toString() {
		return "FormatCodeOptions@"+hashCode()+"[InsertSpaceAfterCommaDelimiter = "+InsertSpaceAfterCommaDelimiter()+", InsertSpaceAfterSemicolonInForStatements = "+InsertSpaceAfterSemicolonInForStatements()+", InsertSpaceBeforeAndAfterBinaryOperators = "+InsertSpaceBeforeAndAfterBinaryOperators()+", InsertSpaceAfterKeywordsInControlFlowStatements = "+InsertSpaceAfterKeywordsInControlFlowStatements()+", InsertSpaceAfterFunctionKeywordForAnonymousFunctions = "+InsertSpaceAfterFunctionKeywordForAnonymousFunctions()+", InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = "+InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis()+", InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = "+InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets()+", PlaceOpenBraceOnNewLineForFunctions = "+PlaceOpenBraceOnNewLineForFunctions()+", PlaceOpenBraceOnNewLineForControlBlocks = "+PlaceOpenBraceOnNewLineForControlBlocks()+"]";
	}
}
