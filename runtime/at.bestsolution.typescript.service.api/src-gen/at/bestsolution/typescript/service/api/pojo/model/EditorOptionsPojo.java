package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

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
	public IndentStyle IndentStyle() {
		if( _IndentStyle != null ) return _IndentStyle;
		return _IndentStyle = at.bestsolution.typescript.service.api.model.IndentStyle.fromStringValue(this.IndentStyle);
	}
	public static Builder create(int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle) {
		return new BuilderImpl(new EditorOptionsPojo(), IndentSize, TabSize, NewLineCharacter, ConvertTabsToSpaces, IndentStyle);
	}

	public static class BuilderImpl implements Builder {
		private final EditorOptionsPojo pojo;

		BuilderImpl(EditorOptionsPojo pojo, int IndentSize, int TabSize, String NewLineCharacter, boolean ConvertTabsToSpaces, IndentStyle IndentStyle) {
			this.pojo = pojo;
			this.pojo.IndentSize = (int)IndentSize;
			this.pojo.TabSize = (int)TabSize;
			this.pojo.NewLineCharacter = (String)NewLineCharacter;
			this.pojo.ConvertTabsToSpaces = (boolean)ConvertTabsToSpaces;
			this.pojo._IndentStyle = IndentStyle;
		}


		public EditorOptions build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "EditorOptions@"+hashCode()+"[IndentSize = "+IndentSize()+", TabSize = "+TabSize()+", NewLineCharacter = "+NewLineCharacter()+", ConvertTabsToSpaces = "+ConvertTabsToSpaces()+", IndentStyle = "+IndentStyle()+"]";
	}
}
