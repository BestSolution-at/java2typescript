package at.bestsolution.typescript.service.api.services;

import at.bestsolution.typescript.service.api.model.*;

public interface LanguageService {
	public String addFile(String filePath);
	public void modifyContent(String fileId, int offset, int length, String text);
	public void cleanupSemanticCache();
	public java.util.List<? extends Diagnostic> getSyntacticDiagnostics(String fileId);
	public java.util.List<? extends Diagnostic> getSemanticDiagnostics(String fileId);
	public java.util.List<? extends Diagnostic> getCompilerOptionsDiagnostics();
	public Classifications getEncodedSyntacticClassifications(String fileId, TextSpan span);
	public Classifications getEncodedSemanticClassifications(String fileId, TextSpan span);
	public CompletionInfo getCompletionsAtPosition(String fileId, int position);
	public CompletionEntryDetails getCompletionEntryDetails(String fileId, int position, String entryName);
	public QuickInfo getQuickInfoAtPosition(String fileId, int position);
	public TextSpan getNameOrDottedNameSpan(String fileId, int startPos, int endPos);
	public TextSpan getBreakpointStatementAtPosition(String fileId, int position);
	public SignatureHelpItems getSignatureHelpItems(String fileId, int position);
	public RenameInfo getRenameInfo(String fileId, int position);
	public java.util.List<? extends RenameLocation> findRenameLocations(String fileId, int position, boolean findInStrings, boolean findInComments);
	public java.util.List<? extends DefinitionInfo> getDefinitionAtPosition(String fileId, int position);
	public java.util.List<? extends DefinitionInfo> getTypeDefinitionAtPosition(String fileId, int position);
	public java.util.List<? extends ReferenceEntry> getReferencesAtPosition(String fileId, int position);
	public java.util.List<? extends ReferencedSymbol> findReferences(String fileId, int position);
	public java.util.List<? extends DocumentHighlights> getDocumentHighlights(String fileId, int position, java.util.List<? extends String> filesToSearch);
	public java.util.List<? extends NavigateToItem> getNavigateToItems(String searchValue, int maxResultCount);
	public java.util.List<? extends NavigationBarItem> getNavigationBarItems(String fileId);
	public java.util.List<? extends OutliningSpan> getOutliningSpans(String fileId);
	public java.util.List<? extends TodoComment> getTodoComments(String fileId, java.util.List<? extends TodoCommentDescriptor> descriptors);
	public java.util.List<? extends TextSpan> getBraceMatchingAtPosition(String fileId, int position);
	public int getIndentationAtPosition(String fileId, int position, EditorOptions options);
	public java.util.List<? extends TextChange> getFormattingEditsForRange(String fileId, int start, int end, FormatCodeOptions options);
	public java.util.List<? extends TextChange> getFormattingEditsForDocument(String fileId, FormatCodeOptions options);
	public java.util.List<? extends TextChange> getFormattingEditsAfterKeystroke(String fileId, int position, String key, FormatCodeOptions options);
	public TextInsertion getDocCommentTemplateAtPosition(String fileId, int position);
	public EmitOutput getEmitOutput(String fileId);
}
