package at.bestsolution.typescript.service.api.internal;


public class ChangeRequest {
	private int line;
	private int offset;
	private int endLine;
	private int endOffset;
	private String insertString;
	private String file;

	public ChangeRequest(int line, int offset, int endLine, int endOffset, String insertString, String file) {
		this.line = line;
		this.offset = offset;
		this.endLine = endLine;
		this.endOffset = endOffset;
		this.insertString = insertString;
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
	public void setInsertString(String insertString) {
		this.insertString = insertString;
	}

	public String getInsertString() {
		return this.insertString;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
