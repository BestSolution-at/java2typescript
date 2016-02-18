package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItems  {
	public java.util.List<SignatureHelpItem> items();
	public TextSpan applicableSpan();
	public int selectedItemIndex();
	public int argumentIndex();
	public int argumentCount();

	public interface Builder {
		public SignatureHelpItems build();
	}
}
