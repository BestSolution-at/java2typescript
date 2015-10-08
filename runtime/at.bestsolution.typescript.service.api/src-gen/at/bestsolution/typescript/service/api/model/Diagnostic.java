package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class Diagnostic  {
	private Location start ;
	private Location end ;
	private String text ;

	public Diagnostic() {
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
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "Diagnostic@"+hashCode()+"[start = "+start+", end = "+end+", text = "+text+"]";
	}
}
