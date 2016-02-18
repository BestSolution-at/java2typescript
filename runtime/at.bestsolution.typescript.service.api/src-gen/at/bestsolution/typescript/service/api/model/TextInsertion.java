package at.bestsolution.typescript.service.api.model;

public interface TextInsertion  {
	public String newText();
	public int caretOffset();

	public interface Builder {
		public TextInsertion build();
	}
}
