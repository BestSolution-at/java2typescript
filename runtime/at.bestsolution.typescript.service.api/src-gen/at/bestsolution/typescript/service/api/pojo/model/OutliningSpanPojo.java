package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.OutliningSpan;

public class OutliningSpanPojo  implements OutliningSpan {
	private TextSpanPojo textSpan ;
	private TextSpanPojo hintSpan ;
	private String bannerText ;
	private boolean autoCollapse ;

	public OutliningSpanPojo() {
	}

	public TextSpanPojo textSpan() {
		return this.textSpan;
	}
	public TextSpanPojo hintSpan() {
		return this.hintSpan;
	}
	public String bannerText() {
		return this.bannerText;
	}
	public boolean autoCollapse() {
		return this.autoCollapse;
	}

	public String toString() {
		return "OutliningSpan@"+hashCode()+"[textSpan = "+textSpan()+", hintSpan = "+hintSpan()+", bannerText = "+bannerText()+", autoCollapse = "+autoCollapse()+"]";
	}
}
