package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class TodoCommentPojo  implements TodoComment {
	private TodoCommentDescriptorPojo descriptor ;
	private String message ;
	private int position ;

	public TodoCommentPojo() {
	}

	public TodoCommentDescriptor descriptor() {
		return this.descriptor;
	}
	public String message() {
		return this.message;
	}
	public int position() {
		return this.position;
	}
	public static Builder create(TodoCommentDescriptor descriptor, String message, int position) {
		return new BuilderImpl(new TodoCommentPojo(), descriptor, message, position);
	}

	public static class BuilderImpl implements Builder {
		private final TodoCommentPojo pojo;

		BuilderImpl(TodoCommentPojo pojo, TodoCommentDescriptor descriptor, String message, int position) {
			this.pojo = pojo;
			this.pojo.descriptor = (TodoCommentDescriptorPojo)descriptor;
			this.pojo.message = (String)message;
			this.pojo.position = (int)position;
		}


		public TodoComment build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "TodoComment@"+hashCode()+"[descriptor = "+descriptor()+", message = "+message()+", position = "+position()+"]";
	}
}
