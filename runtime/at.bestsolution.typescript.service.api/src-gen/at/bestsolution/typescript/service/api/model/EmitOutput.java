package at.bestsolution.typescript.service.api.model;

public interface EmitOutput  {
	public java.util.List<? extends OutputFile> outputFiles();
	public boolean emitSkipped();
}
