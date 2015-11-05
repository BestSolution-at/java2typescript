package at.bestsolution.typescript.service.api.internal;


public class FormatRequest {
	private int line;
	private int offset;
	private int endLine;
	private int endOffset;
	private String file;

	public FormatRequest(int line, int offset, int endLine, int endOffset, String file) {
		this.line = line;
		this.offset = offset;
		this.endLine = endLine;
		this.endOffset = endOffset;
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
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public int getEndLine() {
		return this.endLine;
	}
	public void setEndOffset(int endOffset) {
		this.endOffset = endOffset;
	}

	public int getEndOffset() {
		return this.endOffset;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
