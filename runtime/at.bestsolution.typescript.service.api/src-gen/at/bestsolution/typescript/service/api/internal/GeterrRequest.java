package at.bestsolution.typescript.service.api.internal;


public class GeterrRequest {
	private int delay;
	private String[] files;

	public GeterrRequest(int delay, String[] files) {
		this.delay = delay;
		this.files = files;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getDelay() {
		return this.delay;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}

	public String[] getFiles() {
		return this.files;
	}
}
