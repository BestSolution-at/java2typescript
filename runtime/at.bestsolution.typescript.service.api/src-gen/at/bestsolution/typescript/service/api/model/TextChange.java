package at.bestsolution.typescript.service.api.model;

public interface TextChange  {
	public TextSpan span();
	public int newLength();

	public interface Builder {
		public TextChange build();
	}
}
