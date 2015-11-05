package at.bestsolution.typescript.service.api.internal;


public class FormatonkeyRequest {
	private int line;
	private int offset;
	private String key;
	private String file;

	public FormatonkeyRequest(int line, int offset, String key, String file) {
		this.line = line;
		this.offset = offset;
		this.key = key;
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
	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
