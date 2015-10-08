package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class TextSpan  {
	private Location start ;
	private Location end ;

	public TextSpan() {
	}

	public Location getStart() {
		return this.start;
	}

	public void setStart(Location start) {
		this.start = start;
	}
	public Location getEnd() {
		return this.end;
	}

	public void setEnd(Location end) {
		this.end = end;
	}

	public String toString() {
		return "TextSpan@"+hashCode()+"[start = "+start+", end = "+end+"]";
	}
}
