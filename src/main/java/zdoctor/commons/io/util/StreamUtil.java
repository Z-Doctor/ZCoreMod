package zdoctor.commons.io.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
	public static int bufferSize = 1024;
	
	public static byte[] getInputData(InputStream stream) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buffer = new byte[bufferSize];
			int read = 0;
			while ((read = stream.read(buffer)) > 0) {
				bos.write(buffer, 0, read);
			}
			bos.close();
			return bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new byte[0];
	}
	
	public static InputStream getResourceAsStream(Class class1, String path) {
		return class1.getClassLoader().getResourceAsStream(path);
	}
}
