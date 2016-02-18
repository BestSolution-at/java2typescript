package at.bestsolution.typescript.service.api.model;

public interface RenameLocation  {
	public TextSpan textSpan();
	public String fileName();

	public interface Builder {
		public RenameLocation build();
	}
}
