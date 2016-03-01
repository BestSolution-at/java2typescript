package at.bestsolution.typescript.service.api.services;

import at.bestsolution.typescript.service.api.model.*;

public interface LanguageService {
	public String addFile(String filePath);
	public void removeFile(String fileId);
	public java.util.List<String> initProject(CompilerOptions compilerOptions, java.util.List<String> files);
	public void modifyContent(String fileId, int offset, int length, String text);
	public void open(String fileId);
	public void close(String fileId);
	public void cleanupSemanticCache();
	public java.util.List<Diagnostic> getSyntacticDiagnostics(String fileId);
	public java.util.List<Diagnostic> getSemanticDiagnostics(String fileId);
	public java.util.List<Diagnostic> getCompilerOptionsDiagnostics();
	public Classifications getEncodedSyntacticClassifications(String fileId, TextSpan span);
	public Classifications getEncodedSemanticClassifications(String fileId, TextSpan span);
	public CompletionInfo getCompletionsAtPosition(String fileId, int position);
	public CompletionEntryDetails getCompletionEntryDetails(String fileId, int position, String entryName);
	public QuickInfo getQuickInfoAtPosition(String fileId, int position);
	public TextSpan getNameOrDottedNameSpan(String fileId, int startPos, int endPos);
	public TextSpan getBreakpointStatementAtPosition(String fileId, int position);
	public SignatureHelpItems getSignatureHelpItems(String fileId, int position);
	public RenameInfo getRenameInfo(String fileId, int position);
	public java.util.List<RenameLocation> findRenameLocations(String fileId, int position, boolean findInStrings, boolean findInComments);
	public java.util.List<DefinitionInfo> getDefinitionAtPosition(String fileId, int position);
	public java.util.List<DefinitionInfo> getTypeDefinitionAtPosition(String fileId, int position);
	public java.util.List<ReferenceEntry> getReferencesAtPosition(String fileId, int position);
	public java.util.List<ReferencedSymbol> findReferences(String fileId, int position);
	public java.util.List<DocumentHighlights> getDocumentHighlights(String fileId, int position, java.util.List<String> filesToSearch);
	public java.util.List<NavigateToItem> getNavigateToItems(String searchValue, int maxResultCount);
	public java.util.List<NavigationBarItem> getNavigationBarItems(String fileId);
	public java.util.List<OutliningSpan> getOutliningSpans(String fileId);
	public java.util.List<TodoComment> getTodoComments(String fileId, java.util.List<TodoCommentDescriptor> descriptors);
	public java.util.List<TextSpan> getBraceMatchingAtPosition(String fileId, int position);
	public int getIndentationAtPosition(String fileId, int position, EditorOptions options);
	public java.util.List<TextChange> getFormattingEditsForRange(String fileId, int start, int end, FormatCodeOptions options);
	public java.util.List<TextChange> getFormattingEditsForDocument(String fileId, FormatCodeOptions options);
	public java.util.List<TextChange> getFormattingEditsAfterKeystroke(String fileId, int position, String key, FormatCodeOptions options);
	public TextInsertion getDocCommentTemplateAtPosition(String fileId, int position);
	public EmitOutput getEmitOutput(String fileId);
}
