package at.bestsolution.typescript.service.api.internal.impl;

import at.bestsolution.typescript.service.api.services.ModelBuilderService;
import at.bestsolution.typescript.service.api.model.*;
import at.bestsolution.typescript.service.api.pojo.model.*;

public class ModelBuilderServiceImpl implements ModelBuilderService {
	public Diagnostic.Builder createDiagnostic(SourceFile file, int start, int length, DiagnosticMessage message, DiagnosticCategory category, int code) {
		return DiagnosticPojo.create(file, start, length, message, category, code);
	}
	public DiagnosticMessage.Builder createDiagnosticMessage(String messageText, DiagnosticMessageChain messageChain) {
		return DiagnosticMessagePojo.create(messageText, messageChain);
	}
	public SourceFile.Builder createSourceFile() {
		return SourceFilePojo.create();
	}
	public DiagnosticMessageChain.Builder createDiagnosticMessageChain(String messageText, DiagnosticCategory category, int code) {
		return DiagnosticMessageChainPojo.create(messageText, category, code);
	}
	public TextSpan.Builder createTextSpan(int start, int length) {
		return TextSpanPojo.create(start, length);
	}
	public Classifications.Builder createClassifications(java.util.List<Integer> spans, EndOfLineState endOfLineState) {
		return ClassificationsPojo.create(spans, endOfLineState);
	}
	public CompletionInfo.Builder createCompletionInfo(boolean isMemberCompletion, boolean isNewIdentifierLocation, java.util.List<CompletionEntry> entries) {
		return CompletionInfoPojo.create(isMemberCompletion, isNewIdentifierLocation, entries);
	}
	public CompletionEntry.Builder createCompletionEntry(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, String sortText) {
		return CompletionEntryPojo.create(name, kind, kindModifiers, sortText);
	}
	public CompletionEntryDetails.Builder createCompletionEntryDetails(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
		return CompletionEntryDetailsPojo.create(name, kind, kindModifiers, displayParts, documentation);
	}
	public SymbolDisplayPart.Builder createSymbolDisplayPart(String text, SymbolDisplayPartKind kind) {
		return SymbolDisplayPartPojo.create(text, kind);
	}
	public QuickInfo.Builder createQuickInfo(ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, TextSpan textSpan, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation) {
		return QuickInfoPojo.create(kind, kindModifiers, textSpan, displayParts, documentation);
	}
	public SignatureHelpItems.Builder createSignatureHelpItems(java.util.List<SignatureHelpItem> items, TextSpan applicableSpan, int selectedItemIndex, int argumentIndex, int argumentCount) {
		return SignatureHelpItemsPojo.create(items, applicableSpan, selectedItemIndex, argumentIndex, argumentCount);
	}
	public SignatureHelpItem.Builder createSignatureHelpItem(boolean isVariadic, java.util.List<SymbolDisplayPart> prefixDisplayParts, java.util.List<SymbolDisplayPart> suffixDisplayParts, java.util.List<SymbolDisplayPart> separatorDisplayParts, java.util.List<SignatureHelpParameter> parameters, java.util.List<SymbolDisplayPart> documentation) {
		return SignatureHelpItemPojo.create(isVariadic, prefixDisplayParts, suffixDisplayParts, separatorDisplayParts, parameters, documentation);
	}
	public SignatureHelpParameter.Builder createSignatureHelpParameter(String name, java.util.List<SymbolDisplayPart> documentation, java.util.List<SymbolDisplayPart> displayParts, boolean isOptional) {
		return SignatureHelpParameterPojo.create(name, documentation, displayParts, isOptional);
	}
	public RenameInfo.Builder createRenameInfo(boolean canRename, String localizedErrorMessage, String displayName, String fullDisplayName, String kind, String kindModifiers, TextSpan triggerSpan) {
		return RenameInfoPojo.create(canRename, localizedErrorMessage, displayName, fullDisplayName, kind, kindModifiers, triggerSpan);
	}
	public RenameLocation.Builder createRenameLocation(TextSpan textSpan, String fileName) {
		return RenameLocationPojo.create(textSpan, fileName);
	}
	public DefinitionInfo.Builder createDefinitionInfo(String fileName, TextSpan textSpan, String kind, String name, String containerKind, String containerName) {
		return DefinitionInfoPojo.create(fileName, textSpan, kind, name, containerKind, containerName);
	}
	public ReferenceEntry.Builder createReferenceEntry(TextSpan textSpan, String fileName, boolean isWriteAccess) {
		return ReferenceEntryPojo.create(textSpan, fileName, isWriteAccess);
	}
	public ReferencedSymbol.Builder createReferencedSymbol(DefinitionInfo definition, java.util.List<ReferenceEntry> references) {
		return ReferencedSymbolPojo.create(definition, references);
	}
	public DocumentHighlights.Builder createDocumentHighlights(String fileName, java.util.List<HighlightSpan> highlightSpans) {
		return DocumentHighlightsPojo.create(fileName, highlightSpans);
	}
	public HighlightSpan.Builder createHighlightSpan(TextSpan textSpan, HighlightSpanKind kind) {
		return HighlightSpanPojo.create(textSpan, kind);
	}
	public NavigateToItem.Builder createNavigateToItem(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, PatternMatchKind matchKind, boolean isCaseSensitive, String fileName, TextSpan textSpan, String containerName, String containerKind) {
		return NavigateToItemPojo.create(name, kind, kindModifiers, matchKind, isCaseSensitive, fileName, textSpan, containerName, containerKind);
	}
	public NavigationBarItem.Builder createNavigationBarItem(String text, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<TextSpan> spans, java.util.List<NavigationBarItem> childItems, int indent, boolean bolded, boolean grayed) {
		return NavigationBarItemPojo.create(text, kind, kindModifiers, spans, childItems, indent, bolded, grayed);
	}
	public OutliningSpan.Builder createOutliningSpan(TextSpan textSpan, TextSpan hintSpan, String bannerText, boolean autoCollapse) {
		return OutliningSpanPojo.create(textSpan, hintSpan, bannerText, autoCollapse);
	}
	public TodoCommentDescriptor.Builder createTodoCommentDescriptor(String text, int priority) {
		return TodoCommentDescriptorPojo.create(text, priority);
	}
	public TodoComment.Builder createTodoComment(TodoCommentDescriptor descriptor, String message, int position) {
		return TodoCommentPojo.create(descriptor, message, position);
	}
	public EditorOptions.Builder createEditorOptions(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle) {
		return EditorOptionsPojo.create(IndentSize, TabSize, NewLineCharacter, ConvertTabsToSpaces, IndentStyle);
	}
	public TextChange.Builder createTextChange(TextSpan span, int newLength) {
		return TextChangePojo.create(span, newLength);
	}
	public FormatCodeOptions.Builder createFormatCodeOptions(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle, boolean InsertSpaceAfterCommaDelimiter, boolean InsertSpaceAfterSemicolonInForStatements, boolean InsertSpaceBeforeAndAfterBinaryOperators, boolean InsertSpaceAfterKeywordsInControlFlowStatements, boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, boolean PlaceOpenBraceOnNewLineForFunctions, boolean PlaceOpenBraceOnNewLineForControlBlocks) {
		return FormatCodeOptionsPojo.create(IndentSize, TabSize, NewLineCharacter, ConvertTabsToSpaces, IndentStyle, InsertSpaceAfterCommaDelimiter, InsertSpaceAfterSemicolonInForStatements, InsertSpaceBeforeAndAfterBinaryOperators, InsertSpaceAfterKeywordsInControlFlowStatements, InsertSpaceAfterFunctionKeywordForAnonymousFunctions, InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, PlaceOpenBraceOnNewLineForFunctions, PlaceOpenBraceOnNewLineForControlBlocks);
	}
	public TextInsertion.Builder createTextInsertion(String newText, int caretOffset) {
		return TextInsertionPojo.create(newText, caretOffset);
	}
	public EmitOutput.Builder createEmitOutput(java.util.List<OutputFile> outputFiles, boolean emitSkipped) {
		return EmitOutputPojo.create(outputFiles, emitSkipped);
	}
	public OutputFile.Builder createOutputFile(String name, boolean writeByteOrderMark, String text) {
		return OutputFilePojo.create(name, writeByteOrderMark, text);
	}
	public CompilerOptions.Builder createCompilerOptions(boolean allowNonTsExtensions) {
		return CompilerOptionsPojo.create(allowNonTsExtensions);
	}
}
