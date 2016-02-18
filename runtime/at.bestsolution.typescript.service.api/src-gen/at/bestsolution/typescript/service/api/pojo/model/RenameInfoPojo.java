package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class RenameInfoPojo  implements RenameInfo {
	private boolean canRename ;
	private String localizedErrorMessage ;
	private String displayName ;
	private String fullDisplayName ;
	private String kind ;
	private String kindModifiers ;
	private TextSpanPojo triggerSpan ;

	public RenameInfoPojo() {
	}

	public boolean canRename() {
		return this.canRename;
	}
	public String localizedErrorMessage() {
		return this.localizedErrorMessage;
	}
	public String displayName() {
		return this.displayName;
	}
	public String fullDisplayName() {
		return this.fullDisplayName;
	}
	public String kind() {
		return this.kind;
	}
	public String kindModifiers() {
		return this.kindModifiers;
	}
	public TextSpan triggerSpan() {
		return this.triggerSpan;
	}
	public static Builder create(boolean canRename, String localizedErrorMessage, String displayName, String fullDisplayName, String kind, String kindModifiers, TextSpan triggerSpan) {
		return new BuilderImpl(new RenameInfoPojo(), canRename, localizedErrorMessage, displayName, fullDisplayName, kind, kindModifiers, triggerSpan);
	}

	public static class BuilderImpl implements Builder {
		private final RenameInfoPojo pojo;

		BuilderImpl(RenameInfoPojo pojo, boolean canRename, String localizedErrorMessage, String displayName, String fullDisplayName, String kind, String kindModifiers, TextSpan triggerSpan) {
			this.pojo = pojo;
			this.pojo.canRename = (boolean)canRename;
			this.pojo.localizedErrorMessage = (String)localizedErrorMessage;
			this.pojo.displayName = (String)displayName;
			this.pojo.fullDisplayName = (String)fullDisplayName;
			this.pojo.kind = (String)kind;
			this.pojo.kindModifiers = (String)kindModifiers;
			this.pojo.triggerSpan = (TextSpanPojo)triggerSpan;
		}


		public RenameInfo build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "RenameInfo@"+hashCode()+"[canRename = "+canRename()+", localizedErrorMessage = "+localizedErrorMessage()+", displayName = "+displayName()+", fullDisplayName = "+fullDisplayName()+", kind = "+kind()+", kindModifiers = "+kindModifiers()+", triggerSpan = "+triggerSpan()+"]";
	}
}
