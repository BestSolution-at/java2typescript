package at.bestsolution.typescript.service.api.internal.local;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Pattern;

public class FileSlurp {
	private static final Pattern winFilePath = Pattern.compile("^\\w:");
	private static final Pattern urlPath = Pattern.compile("^\\w+:");
	private static final boolean win32 = System.getProperty("os.name").toLowerCase().startsWith("windows");

		public String read(String filename) throws IOException {
			if( (win32 && winFilePath.matcher(filename).find()) || ! urlPath.matcher(filename).find() ) {
				try(FileInputStream in = new FileInputStream(new File(filename)) ) {
					return getContent(in);
				}
			} else {
				return getContent(new URL(filename));
			}
		}

		public static String getContent(URL url) throws IOException {
			try( InputStream in = url.openStream() ) {
				return getContent(in);
			}
		}

		private static String getContent(InputStream in) {
			byte[] buf = new byte[1024];
			int l = 0;
			StringBuilder b = new StringBuilder();
			try {
				while ((l = in.read(buf)) != -1) {
					b.append(new String(buf, 0, l));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return b.toString();
		}
	}