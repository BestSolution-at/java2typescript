package at.bestsolution.typescript.service.api.services;

import at.bestsolution.typescript.service.api.model.*;

public interface ModelBuilderService {

	public Diagnostic.Builder createDiagnostic(SourceFile file, int start, int length, DiagnosticMessage message, DiagnosticCategory category, int code);

	public DiagnosticMessage.Builder createDiagnosticMessage(String messageText, DiagnosticMessageChain messageChain);

	public SourceFile.Builder createSourceFile();

	public DiagnosticMessageChain.Builder createDiagnosticMessageChain(String messageText, DiagnosticCategory category, int code);

	public TextSpan.Builder createTextSpan(int start, int length);

	public Classifications.Builder createClassifications(java.util.List<Integer> spans, EndOfLineState endOfLineState);

	public CompletionInfo.Builder createCompletionInfo(boolean isMemberCompletion, boolean isNewIdentifierLocation, java.util.List<CompletionEntry> entries);

	public CompletionEntry.Builder createCompletionEntry(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, String sortText);

	public CompletionEntryDetails.Builder createCompletionEntryDetails(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation);

	public SymbolDisplayPart.Builder createSymbolDisplayPart(String text, SymbolDisplayPartKind kind);

	public QuickInfo.Builder createQuickInfo(ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, TextSpan textSpan, java.util.List<SymbolDisplayPart> displayParts, java.util.List<SymbolDisplayPart> documentation);

	public SignatureHelpItems.Builder createSignatureHelpItems(java.util.List<SignatureHelpItem> items, TextSpan applicableSpan, int selectedItemIndex, int argumentIndex, int argumentCount);

	public SignatureHelpItem.Builder createSignatureHelpItem(boolean isVariadic, java.util.List<SymbolDisplayPart> prefixDisplayParts, java.util.List<SymbolDisplayPart> suffixDisplayParts, java.util.List<SymbolDisplayPart> separatorDisplayParts, java.util.List<SignatureHelpParameter> parameters, java.util.List<SymbolDisplayPart> documentation);

	public SignatureHelpParameter.Builder createSignatureHelpParameter(String name, java.util.List<SymbolDisplayPart> documentation, java.util.List<SymbolDisplayPart> displayParts, boolean isOptional);

	public RenameInfo.Builder createRenameInfo(boolean canRename, String localizedErrorMessage, String displayName, String fullDisplayName, String kind, String kindModifiers, TextSpan triggerSpan);

	public RenameLocation.Builder createRenameLocation(TextSpan textSpan, String fileName);

	public DefinitionInfo.Builder createDefinitionInfo(String fileName, TextSpan textSpan, String kind, String name, String containerKind, String containerName);

	public ReferenceEntry.Builder createReferenceEntry(TextSpan textSpan, String fileName, boolean isWriteAccess);

	public ReferencedSymbol.Builder createReferencedSymbol(DefinitionInfo definition, java.util.List<ReferenceEntry> references);

	public DocumentHighlights.Builder createDocumentHighlights(String fileName, java.util.List<HighlightSpan> highlightSpans);

	public HighlightSpan.Builder createHighlightSpan(TextSpan textSpan, HighlightSpanKind kind);

	public NavigateToItem.Builder createNavigateToItem(String name, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, PatternMatchKind matchKind, boolean isCaseSensitive, String fileName, TextSpan textSpan, String containerName, String containerKind);

	public NavigationBarItem.Builder createNavigationBarItem(String text, ScriptElementKind kind, java.util.List<ScriptElementKindModifier> kindModifiers, java.util.List<TextSpan> spans, java.util.List<NavigationBarItem> childItems, int indent, boolean bolded, boolean grayed);

	public OutliningSpan.Builder createOutliningSpan(TextSpan textSpan, TextSpan hintSpan, String bannerText, boolean autoCollapse);

	public TodoCommentDescriptor.Builder createTodoCommentDescriptor(String text, int priority);

	public TodoComment.Builder createTodoComment(TodoCommentDescriptor descriptor, String message, int position);

	public EditorOptions.Builder createEditorOptions(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle);

	public TextChange.Builder createTextChange(TextSpan span, int newLength);

	public FormatCodeOptions.Builder createFormatCodeOptions(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle, boolean InsertSpaceAfterCommaDelimiter, boolean InsertSpaceAfterSemicolonInForStatements, boolean InsertSpaceBeforeAndAfterBinaryOperators, boolean InsertSpaceAfterKeywordsInControlFlowStatements, boolean InsertSpaceAfterFunctionKeywordForAnonymousFunctions, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis, boolean InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets, boolean PlaceOpenBraceOnNewLineForFunctions, boolean PlaceOpenBraceOnNewLineForControlBlocks);

	public TextInsertion.Builder createTextInsertion(String newText, int caretOffset);

	public EmitOutput.Builder createEmitOutput(java.util.List<OutputFile> outputFiles, boolean emitSkipped);

	public OutputFile.Builder createOutputFile(String name, boolean writeByteOrderMark, String text);

	public CompilerOptions.Builder createCompilerOptions(boolean allowNonTsExtensions);

}
