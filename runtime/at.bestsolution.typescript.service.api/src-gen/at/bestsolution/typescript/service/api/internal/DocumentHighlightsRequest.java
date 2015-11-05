package at.bestsolution.typescript.service.api.internal;


public class DocumentHighlightsRequest {
	private int line;
	private int offset;
	private String file;
	private String[] filesToSearch;

	public DocumentHighlightsRequest(int line, int offset, String file, String[] filesToSearch) {
		this.line = line;
		this.offset = offset;
		this.file = file;
		this.filesToSearch = filesToSearch;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getLine() {
		return this.line;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getOffset() {
		return this.offset;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
	public void setFilesToSearch(String[] filesToSearch) {
		this.filesToSearch = filesToSearch;
	}

	public String[] getFilesToSearch() {
		return this.filesToSearch;
	}
}
