package at.bestsolution.typescript.service.api.model;

public interface TextSpan  {
	public int start();
	public int length();

	public interface Builder {
		public TextSpan build();
	}
}
