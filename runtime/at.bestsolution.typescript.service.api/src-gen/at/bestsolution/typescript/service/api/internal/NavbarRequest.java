package at.bestsolution.typescript.service.api.internal;


public class NavbarRequest {
	private String file;

	public NavbarRequest(String file) {
		this.file = file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
