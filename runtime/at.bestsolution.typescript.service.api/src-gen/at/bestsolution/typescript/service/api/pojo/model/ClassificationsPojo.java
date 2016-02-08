package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.Classifications;

public class ClassificationsPojo  implements Classifications {
	private java.util.List<Integer> spans ;
	private String endOfLineState  = "None";
	private at.bestsolution.typescript.service.api.model.EndOfLineState _endOfLineState = null;

	public ClassificationsPojo() {
	}

	public java.util.List<Integer> spans() {
		return this.spans;
	}
	public at.bestsolution.typescript.service.api.model.EndOfLineState endOfLineState() {
		if( _endOfLineState != null ) return _endOfLineState;
		return _endOfLineState = at.bestsolution.typescript.service.api.model.EndOfLineState.fromStringValue(this.endOfLineState);
	}

	public String toString() {
		return "Classifications@"+hashCode()+"[spans = "+spans()+", endOfLineState = "+endOfLineState()+"]";
	}
}
