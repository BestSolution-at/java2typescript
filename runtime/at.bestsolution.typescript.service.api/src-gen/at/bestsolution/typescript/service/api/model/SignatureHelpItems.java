package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItems  {
	public java.util.List<? extends SignatureHelpItem> getItems();
	public TextSpan getApplicableSpan();
	public int getSelectedItemIndex();
	public int getArgumentIndex();
	public int getArgumentCount();
}
