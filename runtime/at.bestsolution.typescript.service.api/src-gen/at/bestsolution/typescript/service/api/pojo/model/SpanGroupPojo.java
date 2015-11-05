package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SpanGroup;

public class SpanGroupPojo  implements SpanGroup {
	private String file ;
	private TextSpanPojo[] locs ;

	public SpanGroupPojo() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public TextSpanPojo[] getLocs() {
		return this.locs;
	}

	public void setLocs(TextSpanPojo[] locs) {
		this.locs = locs;
	}

	public String toString() {
		return "SpanGroup@"+hashCode()+"[file = "+file+", locs = "+locs+"]";
	}
}
