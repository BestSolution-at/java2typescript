package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class SpanGroup  {
	private String file ;
	private TextSpan[] locs ;

	public SpanGroup() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public TextSpan[] getLocs() {
		return this.locs;
	}

	public void setLocs(TextSpan[] locs) {
		this.locs = locs;
	}

	public String toString() {
		return "SpanGroup@"+hashCode()+"[file = "+file+", locs = "+locs+"]";
	}
}
