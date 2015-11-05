package at.bestsolution.typescript.service.api.internal;


public class GeterrForProjectRequest {
	private int delay;
	private String file;

	public GeterrForProjectRequest(int delay, String file) {
		this.delay = delay;
		this.file = file;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getDelay() {
		return this.delay;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
}
