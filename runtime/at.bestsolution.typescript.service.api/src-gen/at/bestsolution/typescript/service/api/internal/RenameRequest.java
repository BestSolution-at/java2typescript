package at.bestsolution.typescript.service.api.internal;


public class RenameRequest {
	private int line;
	private int offset;
	private String file;
	private boolean findInComments;
	private boolean findInStrings;

	public RenameRequest(int line, int offset, String file, boolean findInComments, boolean findInStrings) {
		this.line = line;
		this.offset = offset;
		this.file = file;
		this.findInComments = findInComments;
		this.findInStrings = findInStrings;
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
	public void setFindInComments(boolean findInComments) {
		this.findInComments = findInComments;
	}

	public boolean getFindInComments() {
		return this.findInComments;
	}
	public void setFindInStrings(boolean findInStrings) {
		this.findInStrings = findInStrings;
	}

	public boolean getFindInStrings() {
		return this.findInStrings;
	}
}
