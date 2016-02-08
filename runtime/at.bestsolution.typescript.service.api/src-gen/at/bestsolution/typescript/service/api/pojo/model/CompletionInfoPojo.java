package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.CompletionInfo;

public class CompletionInfoPojo  implements CompletionInfo {
	private boolean isMemberCompletion ;
	private boolean isNewIdentifierLocation ;
	private java.util.List<CompletionEntryPojo> entries ;

	public CompletionInfoPojo() {
	}

	public boolean isMemberCompletion() {
		return this.isMemberCompletion;
	}
	public boolean isNewIdentifierLocation() {
		return this.isNewIdentifierLocation;
	}
	public java.util.List<CompletionEntryPojo> entries() {
		return this.entries;
	}

	public String toString() {
		return "CompletionInfo@"+hashCode()+"[isMemberCompletion = "+isMemberCompletion()+", isNewIdentifierLocation = "+isNewIdentifierLocation()+", entries = "+entries()+"]";
	}
}
