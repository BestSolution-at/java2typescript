package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class TodoCommentDescriptorPojo  implements TodoCommentDescriptor {
	private String text ;
	private int priority ;

	public TodoCommentDescriptorPojo() {
	}

	public String text() {
		return this.text;
	}
	public int priority() {
		return this.priority;
	}
	public static Builder create(String text, int priority) {
		return new BuilderImpl(new TodoCommentDescriptorPojo(), text, priority);
	}

	public static class BuilderImpl implements Builder {
		private final TodoCommentDescriptorPojo pojo;

		BuilderImpl(TodoCommentDescriptorPojo pojo, String text, int priority) {
			this.pojo = pojo;
			this.pojo.text = (String)text;
			this.pojo.priority = (int)priority;
		}


		public TodoCommentDescriptor build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "TodoCommentDescriptor@"+hashCode()+"[text = "+text()+", priority = "+priority()+"]";
	}
}
