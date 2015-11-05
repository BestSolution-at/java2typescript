package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.RenameResponseBody;

public class RenameResponseBodyPojo  implements RenameResponseBody {
	private RenameInfoPojo info ;
	private java.util.List<SpanGroupPojo> locs ;

	public RenameResponseBodyPojo() {
	}

	public RenameInfoPojo getInfo() {
		return this.info;
	}

	public void setInfo(RenameInfoPojo info) {
		this.info = info;
	}
	public java.util.List<SpanGroupPojo> getLocs() {
		return this.locs;
	}

	public void setLocs(java.util.List<SpanGroupPojo> locs) {
		this.locs = locs;
	}

	public String toString() {
		return "RenameResponseBody@"+hashCode()+"[info = "+info+", locs = "+locs+"]";
	}
}
