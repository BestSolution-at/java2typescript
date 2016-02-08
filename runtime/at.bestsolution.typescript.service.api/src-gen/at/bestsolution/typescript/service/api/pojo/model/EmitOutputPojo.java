package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.EmitOutput;

public class EmitOutputPojo  implements EmitOutput {
	private java.util.List<OutputFilePojo> outputFiles ;
	private boolean emitSkipped ;

	public EmitOutputPojo() {
	}

	public java.util.List<OutputFilePojo> outputFiles() {
		return this.outputFiles;
	}
	public boolean emitSkipped() {
		return this.emitSkipped;
	}

	public String toString() {
		return "EmitOutput@"+hashCode()+"[outputFiles = "+outputFiles()+", emitSkipped = "+emitSkipped()+"]";
	}
}
