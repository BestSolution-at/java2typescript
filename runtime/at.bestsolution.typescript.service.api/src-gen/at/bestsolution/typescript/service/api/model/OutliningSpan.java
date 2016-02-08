package at.bestsolution.typescript.service.api.model;

public interface OutliningSpan  {
	public TextSpan textSpan();
	public TextSpan hintSpan();
	public String bannerText();
	public boolean autoCollapse();
}
