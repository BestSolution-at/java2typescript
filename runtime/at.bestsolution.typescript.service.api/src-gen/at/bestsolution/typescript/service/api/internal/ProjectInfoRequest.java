package at.bestsolution.typescript.service.api.internal;


public class ProjectInfoRequest {
	private String file;
	private boolean needFileNameList;

	public ProjectInfoRequest(String file, boolean needFileNameList) {
		this.file = file;
		this.needFileNameList = needFileNameList;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
	public void setNeedFileNameList(boolean needFileNameList) {
		this.needFileNameList = needFileNameList;
	}

	public boolean getNeedFileNameList() {
		return this.needFileNameList;
	}
}
