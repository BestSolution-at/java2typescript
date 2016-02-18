package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class SourceFilePojo  implements SourceFile {

	public SourceFilePojo() {
	}

	public static Builder create() {
		return new BuilderImpl(new SourceFilePojo());
	}

	public static class BuilderImpl implements Builder {
		private final SourceFilePojo pojo;

		BuilderImpl(SourceFilePojo pojo) {
			this.pojo = pojo;
		}


		public SourceFile build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "SourceFile@"+hashCode()+"[]";
	}
}
