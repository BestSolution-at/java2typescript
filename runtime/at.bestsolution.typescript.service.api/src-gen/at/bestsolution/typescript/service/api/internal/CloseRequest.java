package at.bestsolution.typescript.service.api.internal;


public class CloseRequest {
	private String file;

	public CloseRequest(String file) {
		this.file = file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
