package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.CodeEdit;

public class CodeEditPojo  implements CodeEdit {
	private LocationPojo start ;
	private LocationPojo end ;
	private String newText ;

	public CodeEditPojo() {
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
