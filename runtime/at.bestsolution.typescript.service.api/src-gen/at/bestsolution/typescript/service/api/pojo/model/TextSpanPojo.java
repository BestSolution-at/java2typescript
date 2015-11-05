package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.TextSpan;

public class TextSpanPojo  implements TextSpan {
	private LocationPojo start ;
	private LocationPojo end ;

	public TextSpanPojo() {
	}

	public LocationPojo getStart() {
		return this.start;
	}

	public void setStart(LocationPojo start) {
		this.start = start;
	}
	public LocationPojo getEnd() {
		return this.end;
	}

	public void setEnd(LocationPojo end) {
		this.end = end;
	}

	public String toString() {
		return "TextSpan@"+hashCode()+"[start = "+start+", end = "+end+"]";
	}
}
