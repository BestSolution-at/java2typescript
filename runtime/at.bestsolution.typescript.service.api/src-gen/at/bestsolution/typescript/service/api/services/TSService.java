package at.bestsolution.typescript.service.api.services;

import at.bestsolution.typescript.service.api.model.*;

public interface TSService {
	public java.util.List<? extends TextSpan> brace(int line, int offset, String file);
	public void change(int line, int offset, int endLine, int endOffset, String insertString, String file);
	public void close(String file);
	public java.util.List<? extends CompletionEntry> completions(int line, int offset, String prefix, String file);
	public java.util.List<? extends CompletionEntryDetails> completionEntryDetails(int line, int offset, java.util.List<? extends String> entryNames, String file);
	public void configure(String hostInfo, String file, FormatOptions formatOptions);
	public java.util.List<? extends FileSpan> definition(int line, int offset, String file);
	public void exit();
	public java.util.List<? extends CodeEdit> format(int line, int offset, int endLine, int endOffset, String file);
	public java.util.List<? extends CodeEdit> formatonkey(int line, int offset, String key, String file);
	public void geterr(int delay, java.util.List<? extends String> files);
	public void geterrForProject(int delay, String file);
	public java.util.List<? extends NavigationBarItem> navbar(String file);
	public java.util.List<? extends NavtoItem> navto(String searchValue, String file, int maxResultCount);
	public java.util.List<? extends OccurrencesResponseItem> occurrences(int line, int offset, String file);
	public java.util.List<? extends DocumentHighlightsItem> documentHighlights(int line, int offset, String file, java.util.List<? extends String> filesToSearch);
	public void open(String file);
	public QuickInfoResponseBody quickinfo(int line, int offset, String file);
	public ReferencesResponseBody references(int line, int offset, String file);
	public void reload(String file, String tmpfile);
	public RenameResponseBody rename(int line, int offset, String file, boolean findInComments, boolean findInStrings);
	public void saveto(String file, String tmpfile);
	public SignatureHelpItems signatureHelp(int line, int offset, String file);
	public java.util.List<? extends FileSpan> typeDefinition(int line, int offset, String file);
	public ProjectInfo projectInfo(String file, boolean needFileNameList);
	public void reloadProjects();
	public at.bestsolution.typescript.service.api.Registration syntaxDiag(java.util.function.Consumer<DiagnosticEventBody> consumer);
	public at.bestsolution.typescript.service.api.Registration semanticDiag(java.util.function.Consumer<DiagnosticEventBody> consumer);
}
