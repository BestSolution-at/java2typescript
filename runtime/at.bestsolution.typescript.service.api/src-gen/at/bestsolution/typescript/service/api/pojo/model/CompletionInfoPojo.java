package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
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
	public java.util.List<CompletionEntry> entries() {
		return (java.util.List<CompletionEntry>)((java.util.List<?>)this.entries);
	}
	public static Builder create(boolean isMemberCompletion, boolean isNewIdentifierLocation, java.util.List<CompletionEntry> entries) {
		return new BuilderImpl(new CompletionInfoPojo(), isMemberCompletion, isNewIdentifierLocation, entries);
	}

	public static class BuilderImpl implements Builder {
		private final CompletionInfoPojo pojo;

		BuilderImpl(CompletionInfoPojo pojo, boolean isMemberCompletion, boolean isNewIdentifierLocation, java.util.List<CompletionEntry> entries) {
			this.pojo = pojo;
			this.pojo.isMemberCompletion = (boolean)isMemberCompletion;
			this.pojo.isNewIdentifierLocation = (boolean)isNewIdentifierLocation;
			this.pojo.entries = (java.util.List<CompletionEntryPojo>)(java.util.List<?>)entries;
		}


		public CompletionInfo build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "CompletionInfo@"+hashCode()+"[isMemberCompletion = "+isMemberCompletion()+", isNewIdentifierLocation = "+isNewIdentifierLocation()+", entries = "+entries()+"]";
	}
}
