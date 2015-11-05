package at.bestsolution.typescript.service.api.internal;


public class NavtoRequest {
	private String searchValue;
	private String file;
	private int maxResultCount;

	public NavtoRequest(String searchValue, String file, int maxResultCount) {
		this.searchValue = searchValue;
		this.file = file;
		this.maxResultCount = maxResultCount;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public String getSearchValue() {
		return this.searchValue;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
	public void setMaxResultCount(int maxResultCount) {
		this.maxResultCount = maxResultCount;
	}

	public int getMaxResultCount() {
		return this.maxResultCount;
	}
}
