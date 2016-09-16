package java_training.co.jp.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebTest {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://www.163.com");
		
//		try (InputStream is = url.openStream()) {
//			Files.copy(is, Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\163_1.html"));
//		}
		
		try (DataInputStream  his = new DataInputStream(url.openStream())) {
			
			byte[] cache = new byte[1024];
			try (FileOutputStream os = new FileOutputStream(new File("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\163_2.html"))) {
				int result = 0;
				while ((result = his.read(cache)) != -1) {
					os.write(cache, 0, result);
				}
			}
		}
	}

}
