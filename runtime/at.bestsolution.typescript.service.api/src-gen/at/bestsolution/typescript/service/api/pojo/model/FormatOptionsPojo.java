package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.FormatOptions;

public class FormatOptionsPojo  implements FormatOptions {
	private boolean insertSpaceAfterCommaDelimiter ;
	private boolean insertSpaceAfterSemicolonInForStatements ;
	private boolean insertSpaceBeforeAndAfterBinaryOperators ;
	private boolean insertSpaceAfterKeywordsInControlFlowStatements ;
	private boolean insertSpaceAfterFunctionKeywordForAnonymousFunctions ;
	private boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ;
	private boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ;
	private boolean placeOpenBraceOnNewLineForFunctions ;
	private boolean placeOpenBraceOnNewLineForControlBlocks ;

	public FormatOptionsPojo() {
	}

	public boolean getInsertSpaceAfterCommaDelimiter() {
		return this.insertSpaceAfterCommaDelimiter;
	}

	public void setInsertSpaceAfterCommaDelimiter(boolean insertSpaceAfterCommaDelimiter) {
		this.insertSpaceAfterCommaDelimiter = insertSpaceAfterCommaDelimiter;
	}
	public boolean getInsertSpaceAfterSemicolonInForStatements() {
		return this.insertSpaceAfterSemicolonInForStatements;
	}

	public void setInsertSpaceAfterSemicolonInForStatements(boolean insertSpaceAfterSemicolonInForStatements) {
		this.insertSpaceAfterSemicolonInForStatements = insertSpaceAfterSemicolonInForStatements;
	}
	public boolean getInsertSpaceBeforeAndAfterBinaryOperators() {
		return this.insertSpaceBeforeAndAfterBinaryOperators;
	}

	public void setInsertSpaceBeforeAndAfterBinaryOperators(boolean insertSpaceBeforeAndAfterBinaryOperators) {
		this.insertSpaceBeforeAndAfterBinaryOperators = insertSpaceBeforeAndAfterBinaryOperators;
	}
	public boolean getInsertSpaceAfterKeywordsInControlFlowStatements() {
		return this.insertSpaceAfterKeywordsInControlFlowStatements;
	}

	public void setInsertSpaceAfterKeywordsInControlFlowStatements(boolean insertSpaceAfterKeywordsInControlFlowStatements) {
		this.insertSpaceAfterKeywordsInControlFlowStatements = insertSpaceAfterKeywordsInControlFlowStatements;
	}
	public boolean getInsertSpaceAfterFunctionKeywordForAnonymousFunctions() {
		return this.insertSpaceAfterFunctionKeywordForAnonymousFunctions;
	}

	public void setInsertSpaceAfterFunctionKeywordForAnonymousFunctions(boolean insertSpaceAfterFunctionKeywordForAnonymousFunctions) {
		this.insertSpaceAfterFunctionKeywordForAnonymousFunctions = insertSpaceAfterFunctionKeywordForAnonymousFunctions;
	}
	public boolean getInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis() {
		return this.insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;
	}

	public void setInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis) {
		this.insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;
	}
	public boolean getInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets() {
		return this.insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets;
	}

	public void setInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(boolean insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets) {
		this.insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets;
	}
	public boolean getPlaceOpenBraceOnNewLineForFunctions() {
		return this.placeOpenBraceOnNewLineForFunctions;
	}

	public void setPlaceOpenBraceOnNewLineForFunctions(boolean placeOpenBraceOnNewLineForFunctions) {
		this.placeOpenBraceOnNewLineForFunctions = placeOpenBraceOnNewLineForFunctions;
	}
	public boolean getPlaceOpenBraceOnNewLineForControlBlocks() {
		return this.placeOpenBraceOnNewLineForControlBlocks;
	}

	public void setPlaceOpenBraceOnNewLineForControlBlocks(boolean placeOpenBraceOnNewLineForControlBlocks) {
		this.placeOpenBraceOnNewLineForControlBlocks = placeOpenBraceOnNewLineForControlBlocks;
	}

	public String toString() {
		return "FormatOptions@"+hashCode()+"[insertSpaceAfterCommaDelimiter = "+insertSpaceAfterCommaDelimiter+", insertSpaceAfterSemicolonInForStatements = "+insertSpaceAfterSemicolonInForStatements+", insertSpaceBeforeAndAfterBinaryOperators = "+insertSpaceBeforeAndAfterBinaryOperators+", insertSpaceAfterKeywordsInControlFlowStatements = "+insertSpaceAfterKeywordsInControlFlowStatements+", insertSpaceAfterFunctionKeywordForAnonymousFunctions = "+insertSpaceAfterFunctionKeywordForAnonymousFunctions+", insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = "+insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis+", insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = "+insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets+", placeOpenBraceOnNewLineForFunctions = "+placeOpenBraceOnNewLineForFunctions+", placeOpenBraceOnNewLineForControlBlocks = "+placeOpenBraceOnNewLineForControlBlocks+"]";
	}
}
