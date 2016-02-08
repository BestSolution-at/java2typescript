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

	public void modifyContent(String fileId, int offset, int length, String text) {
		dispatcher.sendVoidRequest("LanguageService","modifyContent", projectId,fileId, offset, length, text);
	}

	public void cleanupSemanticCache() {
		dispatcher.sendVoidRequest("LanguageService","cleanupSemanticCache", projectId);
	}

	public java.util.List<? extends Diagnostic> getSyntacticDiagnostics(String fileId) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getSyntacticDiagnostics",DiagnosticPojo.class, projectId,fileId).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends Diagnostic> getSemanticDiagnostics(String fileId) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getSemanticDiagnostics",DiagnosticPojo.class, projectId,fileId).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends Diagnostic> getCompilerOptionsDiagnostics() {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getCompilerOptionsDiagnostics",DiagnosticPojo.class, projectId).get();
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

	public java.util.List<? extends RenameLocation> findRenameLocations(String fileId, int position, boolean findInStrings, boolean findInComments) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","findRenameLocations",RenameLocationPojo.class, projectId,fileId, position, findInStrings, findInComments).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends DefinitionInfo> getDefinitionAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getDefinitionAtPosition",DefinitionInfoPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends DefinitionInfo> getTypeDefinitionAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getTypeDefinitionAtPosition",DefinitionInfoPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends ReferenceEntry> getReferencesAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getReferencesAtPosition",ReferenceEntryPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends ReferencedSymbol> findReferences(String fileId, int position) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","findReferences",ReferencedSymbolPojo.class, projectId,fileId, position).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends DocumentHighlights> getDocumentHighlights(String fileId, int position, java.util.List<? extends String> filesToSearch) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getDocumentHighlights",DocumentHighlightsPojo.class, projectId,fileId, position, filesToSearch).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends NavigateToItem> getNavigateToItems(String searchValue, int maxResultCount) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getNavigateToItems",NavigateToItemPojo.class, projectId,searchValue, maxResultCount).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends NavigationBarItem> getNavigationBarItems(String fileId) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getNavigationBarItems",NavigationBarItemPojo.class, projectId,fileId).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends OutliningSpan> getOutliningSpans(String fileId) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getOutliningSpans",OutliningSpanPojo.class, projectId,fileId).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends TodoComment> getTodoComments(String fileId, java.util.List<? extends TodoCommentDescriptor> descriptors) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getTodoComments",TodoCommentPojo.class, projectId,fileId, descriptors).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends TextSpan> getBraceMatchingAtPosition(String fileId, int position) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getBraceMatchingAtPosition",TextSpanPojo.class, projectId,fileId, position).get();
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

	public java.util.List<? extends TextChange> getFormattingEditsForRange(String fileId, int start, int end, FormatCodeOptions options) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsForRange",TextChangePojo.class, projectId,fileId, start, end, options).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends TextChange> getFormattingEditsForDocument(String fileId, FormatCodeOptions options) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsForDocument",TextChangePojo.class, projectId,fileId, options).get();
		} catch( InterruptedException | java.util.concurrent.ExecutionException e ) {
			throw new RuntimeException(e);
		}
	}

	public java.util.List<? extends TextChange> getFormattingEditsAfterKeystroke(String fileId, int position, String key, FormatCodeOptions options) {
		try {
			return dispatcher.sendMultiValueRequest("LanguageService","getFormattingEditsAfterKeystroke",TextChangePojo.class, projectId,fileId, position, key, options).get();
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
