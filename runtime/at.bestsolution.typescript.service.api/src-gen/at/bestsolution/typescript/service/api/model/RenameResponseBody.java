package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class RenameResponseBody  {
	private RenameInfo info ;
	private SpanGroup[] locs ;

	public RenameResponseBody() {
	}

	public RenameInfo getInfo() {
		return this.info;
	}

	public void setInfo(RenameInfo info) {
		this.info = info;
	}
	public SpanGroup[] getLocs() {
		return this.locs;
	}

	public void setLocs(SpanGroup[] locs) {
		this.locs = locs;
	}

	public String toString() {
		return "RenameResponseBody@"+hashCode()+"[info = "+info+", locs = "+locs+"]";
	}
}
