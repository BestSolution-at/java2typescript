package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.Diagnostic;

public class DiagnosticPojo  implements Diagnostic {
	private LocationPojo start ;
	private LocationPojo end ;
	private String text ;

	public DiagnosticPojo() {
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
