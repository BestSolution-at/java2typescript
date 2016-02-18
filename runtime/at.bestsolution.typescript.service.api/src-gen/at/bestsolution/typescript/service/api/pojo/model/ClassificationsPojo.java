package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

@SuppressWarnings("unchecked")
public class ClassificationsPojo  implements Classifications {
	private java.util.List<Integer> spans ;
	private String endOfLineState  = "None";
	private at.bestsolution.typescript.service.api.model.EndOfLineState _endOfLineState = null;

	public ClassificationsPojo() {
	}

	public java.util.List<Integer> spans() {
		return (java.util.List<Integer>)((java.util.List<?>)this.spans);
	}
	public EndOfLineState endOfLineState() {
		if( _endOfLineState != null ) return _endOfLineState;
		return _endOfLineState = at.bestsolution.typescript.service.api.model.EndOfLineState.fromStringValue(this.endOfLineState);
	}
	public static Builder create(java.util.List<Integer> spans, EndOfLineState endOfLineState) {
		return new BuilderImpl(new ClassificationsPojo(), spans, endOfLineState);
	}

	public static class BuilderImpl implements Builder {
		private final ClassificationsPojo pojo;

		BuilderImpl(ClassificationsPojo pojo, java.util.List<Integer> spans, EndOfLineState endOfLineState) {
			this.pojo = pojo;
			this.pojo.spans = (java.util.List<Integer>)(java.util.List<?>)spans;
			this.pojo._endOfLineState = endOfLineState;
		}


		public Classifications build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "Classifications@"+hashCode()+"[spans = "+spans()+", endOfLineState = "+endOfLineState()+"]";
	}
}
