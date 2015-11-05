package at.bestsolution.typescript.service.api.internal;


public class CompletionEntryDetailsRequest {
	private int line;
	private int offset;
	private java.util.List<? extends String> entryNames;
	private String file;

	public CompletionEntryDetailsRequest(int line, int offset, java.util.List<? extends String> entryNames, String file) {
		this.line = line;
		this.offset = offset;
		this.entryNames = entryNames;
		this.file = file;
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
	public void setEntryNames(java.util.List<? extends String> entryNames) {
		this.entryNames = entryNames;
	}

	public java.util.List<? extends String> getEntryNames() {
		return this.entryNames;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
