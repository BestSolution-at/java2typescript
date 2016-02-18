package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public TextSpan textSpan() {
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
	public static Builder create(String fileName, TextSpan textSpan, String kind, String name, String containerKind, String containerName) {
		return new BuilderImpl(new DefinitionInfoPojo(), fileName, textSpan, kind, name, containerKind, containerName);
	}

	public static class BuilderImpl implements Builder {
		private final DefinitionInfoPojo pojo;

		BuilderImpl(DefinitionInfoPojo pojo, String fileName, TextSpan textSpan, String kind, String name, String containerKind, String containerName) {
			this.pojo = pojo;
			this.pojo.fileName = (String)fileName;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.kind = (String)kind;
			this.pojo.name = (String)name;
			this.pojo.containerKind = (String)containerKind;
			this.pojo.containerName = (String)containerName;
		}


		public DefinitionInfo build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "DefinitionInfo@"+hashCode()+"[fileName = "+fileName()+", textSpan = "+textSpan()+", kind = "+kind()+", name = "+name()+", containerKind = "+containerKind()+", containerName = "+containerName()+"]";
	}
}
