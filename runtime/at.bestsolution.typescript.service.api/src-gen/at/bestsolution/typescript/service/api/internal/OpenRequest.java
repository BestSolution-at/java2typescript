package at.bestsolution.typescript.service.api.internal;


public class OpenRequest {
	private String file;

	public OpenRequest(String file) {
		this.file = file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
