package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItems  {
	public java.util.List<? extends SignatureHelpItem> items();
	public TextSpan applicableSpan();
	public int selectedItemIndex();
	public int argumentIndex();
	public int argumentCount();
}
