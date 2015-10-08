package at.bestsolution.typescript.service.api.services;

import at.bestsolution.typescript.service.api.model.*;

public interface TSService {
	public TextSpan[] brace(int line, int offset, String file);
	public void change(int line, int offset, int endLine, int endOffset, String insertString, String file);
	public void close(String file);
	public CompletionEntry[] completions(int line, int offset, String prefix, String file);
	public CompletionEntryDetails[] completionEntryDetails(int line, int offset, String[] entryNames, String file);
	public void configure(String hostInfo, String file, FormatOptions formatOptions);
	public FileSpan[] definition(int line, int offset, String file);
	public void exit();
	public CodeEdit[] format(int line, int offset, int endLine, int endOffset, String file);
	public CodeEdit[] formatonkey(int line, int offset, String key, String file);
	public void geterr(int delay, String[] files);
	public void geterrForProject(int delay, String file);
	public NavigationBarItem[] navbar(String file);
	public NavtoItem[] navto(String searchValue, String file, int maxResultCount);
	public OccurrencesResponseItem[] occurrences(int line, int offset, String file);
	public DocumentHighlightsItem[] documentHighlights(int line, int offset, String file, String[] filesToSearch);
	public void open(String file);
	public QuickInfoResponseBody quickinfo(int line, int offset, String file);
	public ReferencesResponseBody references(int line, int offset, String file);
	public void reload(String file, String tmpfile);
	public RenameResponseBody rename(int line, int offset, String file, boolean findInComments, boolean findInStrings);
	public void saveto(String file, String tmpfile);
	public SignatureHelpItems signatureHelp(int line, int offset, String file);
	public FileSpan[] typeDefinition(int line, int offset, String file);
	public ProjectInfo projectInfo(String file, boolean needFileNameList);
	public void reloadProjects();
	public at.bestsolution.typescript.service.api.Registration syntaxDiag(java.util.function.Consumer<DiagnosticEventBody> consumer);
	public at.bestsolution.typescript.service.api.Registration semanticDiag(java.util.function.Consumer<DiagnosticEventBody> consumer);
}
