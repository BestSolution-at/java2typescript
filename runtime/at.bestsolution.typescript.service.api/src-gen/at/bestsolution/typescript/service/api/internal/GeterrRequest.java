package at.bestsolution.typescript.service.api.internal;


public class GeterrRequest {
	private int delay;
	private java.util.List<? extends String> files;

	public GeterrRequest(int delay, java.util.List<? extends String> files) {
		this.delay = delay;
		this.files = files;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getDelay() {
		return this.delay;
	}
	public void setFiles(java.util.List<? extends String> files) {
		this.files = files;
	}

	public java.util.List<? extends String> getFiles() {
		return this.files;
	}
}
