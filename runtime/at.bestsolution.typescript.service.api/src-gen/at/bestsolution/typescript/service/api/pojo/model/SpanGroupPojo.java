package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.SpanGroup;

public class SpanGroupPojo  implements SpanGroup {
	private String file ;
	private java.util.List<TextSpanPojo> locs ;

	public SpanGroupPojo() {
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	public java.util.List<TextSpanPojo> getLocs() {
		return this.locs;
	}

	public void setLocs(java.util.List<TextSpanPojo> locs) {
		this.locs = locs;
	}

	public String toString() {
		return "SpanGroup@"+hashCode()+"[file = "+file+", locs = "+locs+"]";
	}
}
