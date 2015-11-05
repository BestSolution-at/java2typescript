package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.RenameResponseBody;

public class RenameResponseBodyPojo  implements RenameResponseBody {
	private RenameInfoPojo info ;
	private SpanGroupPojo[] locs ;

	public RenameResponseBodyPojo() {
	}

	public RenameInfoPojo getInfo() {
		return this.info;
	}

	public void setInfo(RenameInfoPojo info) {
		this.info = info;
	}
	public SpanGroupPojo[] getLocs() {
		return this.locs;
	}

	public void setLocs(SpanGroupPojo[] locs) {
		this.locs = locs;
	}

	public String toString() {
		return "RenameResponseBody@"+hashCode()+"[info = "+info+", locs = "+locs+"]";
	}
}
