package at.bestsolution.typescript.service.api.internal;


public class CompletionsRequest {
	private int line;
	private int offset;
	private String prefix;
	private String file;

	public CompletionsRequest(int line, int offset, String prefix, String file) {
		this.line = line;
		this.offset = offset;
		this.prefix = prefix;
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
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getPrefix() {
		return this.prefix;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
