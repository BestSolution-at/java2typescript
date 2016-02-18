package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class FormatCodeOptionsPojo  implements FormatCodeOptions {
	private int IndentSize ;
	private int TabSize ;
	private String NewLineCharacter ;
	private boolean ConvertTabsToSpaces ;
		private String IndentStyle  = "None";
	private at.bestsolution.typescript.service.api.model.IndentStyle _IndentStyle = null;
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

	public int IndentSize() {
		return this.IndentSize;
	}
	public int TabSize() {
		return this.TabSize;
	}
	public String NewLineCharacter() {
		return this.NewLineCharacter;
	}
	public boolean ConvertTabsToSpaces() {
		return this.ConvertTabsToSpaces;
	}
	public IndentStyle IndentStyle() {
		if( _IndentStyle != null ) return _IndentStyle;
		return _IndentStyle = at.bestsolution.typescript.service.api.model.IndentStyle.fromValue(this.IndentStyle);
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
	public static Builder create(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle, boolean InsertSpaceAfterCommaDelimiter, boolean InsertSpaceAfterSemicolonInForStatements, boolean InsertSpaceBeforeAndAfterBinaryOperators, boolean InsertSpaceAfterKeywordsInControlFlowStatements, boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, boolean PlaceOpenBraceOnNewLineForFunctions, boolean PlaceOpenBraceOnNewLineForControlBlocks) {
		return new BuilderImpl(new FormatCodeOptionsPojo(), IndentSize, TabSize, NewLineCharacter, ConvertTabsToSpaces, IndentStyle, InsertSpaceAfterCommaDelimiter, InsertSpaceAfterSemicolonInForStatements, InsertSpaceBeforeAndAfterBinaryOperators, InsertSpaceAfterKeywordsInControlFlowStatements, InsertSpaceAfterFunctionKeywordForAnonymousFunctions, InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, PlaceOpenBraceOnNewLineForFunctions, PlaceOpenBraceOnNewLineForControlBlocks);
	}

	public static class BuilderImpl implements Builder {
		private final FormatCodeOptionsPojo pojo;

		BuilderImpl(FormatCodeOptionsPojo pojo, int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle, boolean InsertSpaceAfterCommaDelimiter, boolean InsertSpaceAfterSemicolonInForStatements, boolean InsertSpaceBeforeAndAfterBinaryOperators, boolean InsertSpaceAfterKeywordsInControlFlowStatements, boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, boolean PlaceOpenBraceOnNewLineForFunctions, boolean PlaceOpenBraceOnNewLineForControlBlocks) {
			this.pojo = pojo;
			this.pojo.IndentSize = (int)IndentSize;
			this.pojo.TabSize = (int)TabSize;
			this.pojo.NewLineCharacter = (String)NewLineCharacter;
			this.pojo.ConvertTabsToSpaces = (boolean)ConvertTabsToSpaces;
			this.pojo._IndentStyle = IndentStyle;
			this.pojo.IndentStyle = IndentStyle.asValue();
			this.pojo.InsertSpaceAfterCommaDelimiter = (boolean)InsertSpaceAfterCommaDelimiter;
			this.pojo.InsertSpaceAfterSemicolonInForStatements = (boolean)InsertSpaceAfterSemicolonInForStatements;
			this.pojo.InsertSpaceBeforeAndAfterBinaryOperators = (boolean)InsertSpaceBeforeAndAfterBinaryOperators;
			this.pojo.InsertSpaceAfterKeywordsInControlFlowStatements = (boolean)InsertSpaceAfterKeywordsInControlFlowStatements;
			this.pojo.InsertSpaceAfterFunctionKeywordForAnonymousFunctions = (boolean)InsertSpaceAfterFunctionKeywordForAnonymousFunctions;
			this.pojo.InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = (boolean)InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis;
			this.pojo.InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = (boolean)InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets;
			this.pojo.PlaceOpenBraceOnNewLineForFunctions = (boolean)PlaceOpenBraceOnNewLineForFunctions;
			this.pojo.PlaceOpenBraceOnNewLineForControlBlocks = (boolean)PlaceOpenBraceOnNewLineForControlBlocks;
		}


		public FormatCodeOptions build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "FormatCodeOptions@"+hashCode()+"[IndentSize = "+IndentSize()+", TabSize = "+TabSize()+", NewLineCharacter = "+NewLineCharacter()+", ConvertTabsToSpaces = "+ConvertTabsToSpaces()+", IndentStyle = "+IndentStyle()+", InsertSpaceAfterCommaDelimiter = "+InsertSpaceAfterCommaDelimiter()+", InsertSpaceAfterSemicolonInForStatements = "+InsertSpaceAfterSemicolonInForStatements()+", InsertSpaceBeforeAndAfterBinaryOperators = "+InsertSpaceBeforeAndAfterBinaryOperators()+", InsertSpaceAfterKeywordsInControlFlowStatements = "+InsertSpaceAfterKeywordsInControlFlowStatements()+", InsertSpaceAfterFunctionKeywordForAnonymousFunctions = "+InsertSpaceAfterFunctionKeywordForAnonymousFunctions()+", InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = "+InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis()+", InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = "+InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets()+", PlaceOpenBraceOnNewLineForFunctions = "+PlaceOpenBraceOnNewLineForFunctions()+", PlaceOpenBraceOnNewLineForControlBlocks = "+PlaceOpenBraceOnNewLineForControlBlocks()+"]";
	}
}
