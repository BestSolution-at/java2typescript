package at.bestsolution.typescript.service.api.model;

public interface EmitOutput  {
	public java.util.List<OutputFile> outputFiles();
	public boolean emitSkipped();

	public interface Builder {
		public EmitOutput build();
	}
}
