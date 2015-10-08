package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class QuickInfoResponseBody  {
	private String kind ;
	private String kindModifiers ;
	private Location start ;
	private Location end ;
	private String displayString ;
	private String documentation ;

	public QuickInfoResponseBody() {
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
