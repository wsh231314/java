package java_training.co.jp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class HttpTest {

	public static void main(String[] args) throws IOException {

		String query = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDMXN%22%2C%20%22USDCHF%22)&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";
		
		URL url = new URL(query);
		
		Files.copy(url.openStream(), Paths.get("test1.txt"), StandardCopyOption.REPLACE_EXISTING);
		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		}
	}

}
