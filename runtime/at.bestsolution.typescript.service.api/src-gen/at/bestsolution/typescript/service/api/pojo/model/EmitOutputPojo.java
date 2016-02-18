package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class EmitOutputPojo  implements EmitOutput {
	private java.util.List<OutputFilePojo> outputFiles ;
	private boolean emitSkipped ;

	public EmitOutputPojo() {
	}

	public java.util.List<OutputFile> outputFiles() {
		return (java.util.List<OutputFile>)((java.util.List<?>)this.outputFiles);
	}
	public boolean emitSkipped() {
		return this.emitSkipped;
	}
	public static Builder create(java.util.List<OutputFile> outputFiles, boolean emitSkipped) {
		return new BuilderImpl(new EmitOutputPojo(), outputFiles, emitSkipped);
	}

	public static class BuilderImpl implements Builder {
		private final EmitOutputPojo pojo;

		BuilderImpl(EmitOutputPojo pojo, java.util.List<OutputFile> outputFiles, boolean emitSkipped) {
			this.pojo = pojo;
			this.pojo.outputFiles = (java.util.List<OutputFilePojo>)(java.util.List<?>)outputFiles;
			this.pojo.emitSkipped = (boolean)emitSkipped;
		}


		public EmitOutput build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "EmitOutput@"+hashCode()+"[outputFiles = "+outputFiles()+", emitSkipped = "+emitSkipped()+"]";
	}
}
