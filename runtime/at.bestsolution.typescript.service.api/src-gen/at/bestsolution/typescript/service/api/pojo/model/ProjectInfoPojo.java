package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.ProjectInfo;

public class ProjectInfoPojo  implements ProjectInfo {
	private String configFileName ;
	private java.util.List<String> fileNames ;

	public ProjectInfoPojo() {
	}

	public String getConfigFileName() {
		return this.configFileName;
	}

	public void setConfigFileName(String configFileName) {
		this.configFileName = configFileName;
	}
	public java.util.List<String> getFileNames() {
		return this.fileNames;
	}

	public void setFileNames(java.util.List<String> fileNames) {
		this.fileNames = fileNames;
	}

	public String toString() {
		return "ProjectInfo@"+hashCode()+"[configFileName = "+configFileName+", fileNames = "+fileNames+"]";
	}
}
