package at.bestsolution.typescript.service.api.internal;

import at.bestsolution.typescript.service.api.model.*;

public class ConfigureRequest {
	private String hostInfo;
	private String file;
	private FormatOptions formatOptions;

	public ConfigureRequest(String hostInfo, String file, FormatOptions formatOptions) {
		this.hostInfo = hostInfo;
		this.file = file;
		this.formatOptions = formatOptions;
	}

	public void setHostInfo(String hostInfo) {
		this.hostInfo = hostInfo;
	}

	public String getHostInfo() {
		return this.hostInfo;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}
	public void setFormatOptions(FormatOptions formatOptions) {
		this.formatOptions = formatOptions;
	}

	public FormatOptions getFormatOptions() {
		return this.formatOptions;
	}
}
