package at.bestsolution.typescript.service.api.pojo.model;

import java.util.Map;
import at.bestsolution.typescript.service.api.model.QuickInfoResponseBody;

public class QuickInfoResponseBodyPojo  implements QuickInfoResponseBody {
	private String kind ;
	private String kindModifiers ;
	private LocationPojo start ;
	private LocationPojo end ;
	private String displayString ;
	private String documentation ;

	public QuickInfoResponseBodyPojo() {
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKindModifiers() {
		return this.kindModifiers;
	}

	public void setKindModifiers(String kindModifiers) {
		this.kindModifiers = kindModifiers;
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
	public String getDisplayString() {
		return this.displayString;
	}

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
	public String getDocumentation() {
		return this.documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String toString() {
		return "QuickInfoResponseBody@"+hashCode()+"[kind = "+kind+", kindModifiers = "+kindModifiers+", start = "+start+", end = "+end+", displayString = "+displayString+", documentation = "+documentation+"]";
	}
}
