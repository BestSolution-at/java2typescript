package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.TodoComment;

public class TodoCommentPojo  implements TodoComment {
	private TodoCommentDescriptorPojo descriptor ;
	private String message ;
	private int position ;

	public TodoCommentPojo() {
	}

	public TodoCommentDescriptorPojo descriptor() {
		return this.descriptor;
	}
	public String message() {
		return this.message;
	}
	public int position() {
		return this.position;
	}

	public String toString() {
		return "TodoComment@"+hashCode()+"[descriptor = "+descriptor()+", message = "+message()+", position = "+position()+"]";
	}
}
