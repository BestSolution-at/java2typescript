package at.bestsolution.typescript.service.api.model;

public interface SignatureHelpItems  {
	public SignatureHelpItem[] getItems();
	public TextSpan getApplicableSpan();
	public int getSelectedItemIndex();
	public int getArgumentIndex();
	public int getArgumentCount();
}
