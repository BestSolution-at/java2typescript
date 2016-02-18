package at.bestsolution.typescript.service.api.model;

public enum ScriptTarget {
	ES3(0)
	, ES5(1)
	, ES6(2);

	private final int value;

	ScriptTarget(int value) {
		this.value = value;
	}

	public int asValue() {
		return this.value;
	}

	public static ScriptTarget fromValue(int value) {
		switch( value ) {
			case 0: return ES3;
			case 1: return ES5;
			case 2: return ES6;
			default:
				return ES3;
		}
	}
}
