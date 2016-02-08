package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.DefinitionInfo;

public class DefinitionInfoPojo  implements DefinitionInfo {
	private String fileName ;
	private TextSpanPojo textSpan ;
	private String kind ;
	private String name ;
	private String containerKind ;
	private String containerName ;

	public DefinitionInfoPojo() {
	}

	public String fileName() {
		return this.fileName;
	}
	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public String kind() {
		return this.kind;
	}
	public String name() {
		return this.name;
	}
	public String containerKind() {
		return this.containerKind;
	}
	public String containerName() {
		return this.containerName;
	}

	public String toString() {
		return "DefinitionInfo@"+hashCode()+"[fileName = "+fileName()+", textSpan = "+textSpan()+", kind = "+kind()+", name = "+name()+", containerKind = "+containerKind()+", containerName = "+containerName()+"]";
	}
}
