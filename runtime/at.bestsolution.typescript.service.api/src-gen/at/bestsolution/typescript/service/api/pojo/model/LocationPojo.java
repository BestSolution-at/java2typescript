package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.Location;

public class LocationPojo  implements Location {
	private int line ;
	private int offset ;

	public LocationPojo() {
	}

	public int getLine() {
		return this.line;
	}

	public void setLine(int line) {
		this.line = line;
	}
	public int getOffset() {
		return this.offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String toString() {
		return "Location@"+hashCode()+"[line = "+line+", offset = "+offset+"]";
	}
}
