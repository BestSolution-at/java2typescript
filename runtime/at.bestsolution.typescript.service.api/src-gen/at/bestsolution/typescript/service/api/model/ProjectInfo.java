package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class ProjectInfo  {
	private String configFileName ;
	private String[] fileNames ;

	public ProjectInfo() {
	}

	public String getConfigFileName() {
		return this.configFileName;
	}

	public void setConfigFileName(String configFileName) {
		this.configFileName = configFileName;
	}
	public String[] getFileNames() {
		return this.fileNames;
	}

	public void setFileNames(String[] fileNames) {
		this.fileNames = fileNames;
	}

	public String toString() {
		return "ProjectInfo@"+hashCode()+"[configFileName = "+configFileName+", fileNames = "+fileNames+"]";
	}
}
