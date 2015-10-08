package at.bestsolution.typescript.service.api.model;

import java.util.Map;

public class NavtoItem  {
	private String name ;
	private String kind ;
	private String matchKind ;
	private boolean isCaseSensitive ;
	private String kindModifiers ;
	private String file ;
	private Location start ;
	private Location end ;
	private String containerName ;
	private String containerKind ;

	public NavtoItem() {
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
	public String getMatchKind() {
		return this.matchKind;
	}

	public void setMatchKind(String matchKind) {
		this.matchKind = matchKind;
	}
	public boolean getIsCaseSensitive() {
		return this.isCaseSensitive;
	}

	public void setIsCaseSensitive(boolean isCaseSensitive) {
		this.isCaseSensitive = isCaseSensitive;
	}
	public String getKindModifiers() {
		return this.kindModifiers;
	}

	public void setKindModifiers(String kindModifiers) {
		this.kindModifiers = kindModifiers;
	}
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
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
	public String getContainerName() {
		return this.containerName;
	}

	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	public String getContainerKind() {
		return this.containerKind;
	}

	public void setContainerKind(String containerKind) {
		this.containerKind = containerKind;
	}

	public String toString() {
		return "NavtoItem@"+hashCode()+"[name = "+name+", kind = "+kind+", matchKind = "+matchKind+", isCaseSensitive = "+isCaseSensitive+", kindModifiers = "+kindModifiers+", file = "+file+", start = "+start+", end = "+end+", containerName = "+containerName+", containerKind = "+containerKind+"]";
	}
}
