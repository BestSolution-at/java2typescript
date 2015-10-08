package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class CodeEdit  {
	private Location start ;
	private Location end ;
	private String newText ;

	public CodeEdit() {
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
	public String getNewText() {
		return this.newText;
	}

	public void setNewText(String newText) {
		this.newText = newText;
	}

	public String toString() {
		return "CodeEdit@"+hashCode()+"[start = "+start+", end = "+end+", newText = "+newText+"]";
	}
}
