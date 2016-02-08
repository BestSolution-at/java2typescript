package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.TodoCommentDescriptor;

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

	public String toString() {
		return "TodoCommentDescriptor@"+hashCode()+"[text = "+text()+", priority = "+priority()+"]";
	}
}
