package at.bestsolution.typescript.service.api.internal;


public class QuickinfoRequest {
	private int line;
	private int offset;
	private String file;

	public QuickinfoRequest(int line, int offset, String file) {
		this.line = line;
		this.offset = offset;
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
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
