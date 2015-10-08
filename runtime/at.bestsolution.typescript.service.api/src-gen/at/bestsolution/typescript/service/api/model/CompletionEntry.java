package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class CompletionEntry  {
	private String name ;
	private String kind ;
	private String kindModifiers ;
	private String sortText ;

	public CompletionEntry() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
	public String getSortText() {
		return this.sortText;
	}

	public void setSortText(String sortText) {
		this.sortText = sortText;
	}

	public String toString() {
		return "CompletionEntry@"+hashCode()+"[name = "+name+", kind = "+kind+", kindModifiers = "+kindModifiers+", sortText = "+sortText+"]";
	}
}
