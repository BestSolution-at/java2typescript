package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.EditorOptions;

public class EditorOptionsPojo  implements EditorOptions {
	private int IndentSize ;
	private int TabSize ;
	private String NewLineCharacter ;
	private boolean ConvertTabsToSpaces ;
	private String IndentStyle  = "None";
	private at.bestsolution.typescript.service.api.model.IndentStyle _IndentStyle = null;

	public EditorOptionsPojo() {
	}

	public int IndentSize() {
		return this.IndentSize;
	}
	public int TabSize() {
		return this.TabSize;
	}
	public String NewLineCharacter() {
		return this.NewLineCharacter;
	}
	public boolean ConvertTabsToSpaces() {
		return this.ConvertTabsToSpaces;
	}
	public at.bestsolution.typescript.service.api.model.IndentStyle IndentStyle() {
		if( _IndentStyle != null ) return _IndentStyle;
		return _IndentStyle = at.bestsolution.typescript.service.api.model.IndentStyle.fromStringValue(this.IndentStyle);
	}

	public String toString() {
		return "EditorOptions@"+hashCode()+"[IndentSize = "+IndentSize()+", TabSize = "+TabSize()+", NewLineCharacter = "+NewLineCharacter()+", ConvertTabsToSpaces = "+ConvertTabsToSpaces()+", IndentStyle = "+IndentStyle()+"]";
	}
}
