package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class OutliningSpanPojo  implements OutliningSpan {
	private TextSpanPojo textSpan ;
	private TextSpanPojo hintSpan ;
	private String bannerText ;
	private boolean autoCollapse ;

	public OutliningSpanPojo() {
	}

	public TextSpan textSpan() {
		return this.textSpan;
	}
	public TextSpan hintSpan() {
		return this.hintSpan;
	}
	public String bannerText() {
		return this.bannerText;
	}
	public boolean autoCollapse() {
		return this.autoCollapse;
	}
	public static Builder create(TextSpan textSpan, TextSpan hintSpan, String bannerText, boolean autoCollapse) {
		return new BuilderImpl(new OutliningSpanPojo(), textSpan, hintSpan, bannerText, autoCollapse);
	}

	public static class BuilderImpl implements Builder {
		private final OutliningSpanPojo pojo;

		BuilderImpl(OutliningSpanPojo pojo, TextSpan textSpan, TextSpan hintSpan, String bannerText, boolean autoCollapse) {
			this.pojo = pojo;
			this.pojo.textSpan = (TextSpanPojo)textSpan;
			this.pojo.hintSpan = (TextSpanPojo)hintSpan;
			this.pojo.bannerText = (String)bannerText;
			this.pojo.autoCollapse = (boolean)autoCollapse;
		}


		public OutliningSpan build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "OutliningSpan@"+hashCode()+"[textSpan = "+textSpan()+", hintSpan = "+hintSpan()+", bannerText = "+bannerText()+", autoCollapse = "+autoCollapse()+"]";
	}
}
