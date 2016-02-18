package at.bestsolution.typescript.service.api.model;

public interface Classifications  {
	public java.util.List<Integer> spans();
	public EndOfLineState endOfLineState();

	public interface Builder {
		public Classifications build();
	}
}
