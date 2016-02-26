package at.bestsolution.typescript.service.api.internal.impl;

import at.bestsolution.typescript.service.api.model.*;
import at.bestsolution.typescript.service.api.pojo.model.*;
import at.bestsolution.typescript.service.api.services.Dispatcher;

public class LanguageServiceImpl implements at.bestsolution.typescript.service.api.services.LanguageService {
	private final Dispatcher dispatcher;
	private final String projectId;

	public LanguageServiceImpl(String projectId, Dispatcher dispatcher) {
		this.projectId = projectId;
		this.dispatcher = dispatcher;
	}

	public String addFile(String filePath) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","addFile",String.class, projectId,filePath).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<String> initProject(CompilerOptions compilerOptions, java.util.List<String> files) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","initProject",String.class, projectId,compilerOptions, files).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public void modifyContent(String fileId, int offset, int length, String text) {
		dispatcher.sendVoidRequest("LanguageService","modifyContent", projectId,fileId, offset, length, text);
	}

	public void open(String fileId) {
		dispatcher.sendVoidRequest("LanguageService","open", projectId,fileId);
	}

	public void close(String fileId) {
		dispatcher.sendVoidRequest("LanguageService","close", projectId,fileId);
	}

	public void cleanupSemanticCache() {
		dispatcher.sendVoidRequest("LanguageService","cleanupSemanticCache", projectId);
	}

	@SuppressWarnings("unchecked")
	public java.util.List<Diagnostic> getSyntacticDiagnostics(String fileId) {
		try {
			return (java.util.List<Diagnostic>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getSyntacticDiagnostics",DiagnosticPojo.class, projectId,fileId).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<Diagnostic> getSemanticDiagnostics(String fileId) {
		try {
			return (java.util.List<Diagnostic>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getSemanticDiagnostics",DiagnosticPojo.class, projectId,fileId).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<Diagnostic> getCompilerOptionsDiagnostics() {
		try {
			return (java.util.List<Diagnostic>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getCompilerOptionsDiagnostics",DiagnosticPojo.class, projectId).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public Classifications getEncodedSyntacticClassifications(String fileId, TextSpan span) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getEncodedSyntacticClassifications",ClassificationsPojo.class, projectId,fileId, span).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public Classifications getEncodedSemanticClassifications(String fileId, TextSpan span) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getEncodedSemanticClassifications",ClassificationsPojo.class, projectId,fileId, span).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public CompletionInfo getCompletionsAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getCompletionsAtPosition",CompletionInfoPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public CompletionEntryDetails getCompletionEntryDetails(String fileId, int position, String entryName) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getCompletionEntryDetails",CompletionEntryDetailsPojo.class, projectId,fileId, position, entryName).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public QuickInfo getQuickInfoAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getQuickInfoAtPosition",QuickInfoPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public TextSpan getNameOrDottedNameSpan(String fileId, int startPos, int endPos) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getNameOrDottedNameSpan",TextSpanPojo.class, projectId,fileId, startPos, endPos).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public TextSpan getBreakpointStatementAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getBreakpointStatementAtPosition",TextSpanPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public SignatureHelpItems getSignatureHelpItems(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getSignatureHelpItems",SignatureHelpItemsPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public RenameInfo getRenameInfo(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getRenameInfo",RenameInfoPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<RenameLocation> findRenameLocations(String fileId, int position, boolean findInStrings, boolean findInComments) {
		try {
			return (java.util.List<RenameLocation>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","findRenameLocations",RenameLocationPojo.class, projectId,fileId, position, findInStrings, findInComments).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<DefinitionInfo> getDefinitionAtPosition(String fileId, int position) {
		try {
			return (java.util.List<DefinitionInfo>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getDefinitionAtPosition",DefinitionInfoPojo.class, projectId,fileId, position).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<DefinitionInfo> getTypeDefinitionAtPosition(String fileId, int position) {
		try {
			return (java.util.List<DefinitionInfo>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getTypeDefinitionAtPosition",DefinitionInfoPojo.class, projectId,fileId, position).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<ReferenceEntry> getReferencesAtPosition(String fileId, int position) {
		try {
			return (java.util.List<ReferenceEntry>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getReferencesAtPosition",ReferenceEntryPojo.class, projectId,fileId, position).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<ReferencedSymbol> findReferences(String fileId, int position) {
		try {
			return (java.util.List<ReferencedSymbol>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","findReferences",ReferencedSymbolPojo.class, projectId,fileId, position).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<DocumentHighlights> getDocumentHighlights(String fileId, int position, java.util.List<String> filesToSearch) {
		try {
			return (java.util.List<DocumentHighlights>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getDocumentHighlights",DocumentHighlightsPojo.class, projectId,fileId, position, filesToSearch).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<NavigateToItem> getNavigateToItems(String searchValue, int maxResultCount) {
		try {
			return (java.util.List<NavigateToItem>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getNavigateToItems",NavigateToItemPojo.class, projectId,searchValue, maxResultCount).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<NavigationBarItem> getNavigationBarItems(String fileId) {
		try {
			return (java.util.List<NavigationBarItem>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getNavigationBarItems",NavigationBarItemPojo.class, projectId,fileId).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<OutliningSpan> getOutliningSpans(String fileId) {
		try {
			return (java.util.List<OutliningSpan>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getOutliningSpans",OutliningSpanPojo.class, projectId,fileId).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<TodoComment> getTodoComments(String fileId, java.util.List<TodoCommentDescriptor> descriptors) {
		try {
			return (java.util.List<TodoComment>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getTodoComments",TodoCommentPojo.class, projectId,fileId, descriptors).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<TextSpan> getBraceMatchingAtPosition(String fileId, int position) {
		try {
			return (java.util.List<TextSpan>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getBraceMatchingAtPosition",TextSpanPojo.class, projectId,fileId, position).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public int getIndentationAtPosition(String fileId, int position, EditorOptions options) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getIndentationAtPosition",int.class, projectId,fileId, position, options).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<TextChange> getFormattingEditsForRange(String fileId, int start, int end, FormatCodeOptions options) {
		try {
			return (java.util.List<TextChange>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsForRange",TextChangePojo.class, projectId,fileId, start, end, options).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<TextChange> getFormattingEditsForDocument(String fileId, FormatCodeOptions options) {
		try {
			return (java.util.List<TextChange>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsForDocument",TextChangePojo.class, projectId,fileId, options).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public java.util.List<TextChange> getFormattingEditsAfterKeystroke(String fileId, int position, String key, FormatCodeOptions options) {
		try {
			return (java.util.List<TextChange>)((java.util.List<?>)dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsAfterKeystroke",TextChangePojo.class, projectId,fileId, position, key, options).get());
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public TextInsertion getDocCommentTemplateAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getDocCommentTemplateAtPosition",TextInsertionPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public EmitOutput getEmitOutput(String fileId) {
		try {
			return dispatcher.sendSingleValueRequest("LanguageService","getEmitOutput",EmitOutputPojo.class, projectId,fileId).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

}
