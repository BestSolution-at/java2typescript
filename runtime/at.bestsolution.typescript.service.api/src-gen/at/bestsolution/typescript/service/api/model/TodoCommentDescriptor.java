package at.bestsolution.typescript.service.api.model;

public interface TodoCommentDescriptor  {
	public String text();
	public int priority();

	public interface Builder {
		public TodoCommentDescriptor build();
	}
}
