package at.bestsolution.typescript.service.api.model;

public interface OutputFile  {
	public String name();
	public boolean writeByteOrderMark();
	public String text();

	public interface Builder {
		public OutputFile build();
	}
}
