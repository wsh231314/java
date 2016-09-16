package java_training.co.jp.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class AllTest {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://query.yahooapis.com/v1/public/yql");
		String rawData = "q=select * from yahoo.finance.xchange where pair "
				+ "in (\"USDEUR\", \"USDJPY\", \"USDBGN\", \"USDCZK\")&env=store://datatables.org/alltableswithkeys";
		String encodedData = URLEncoder.encode(rawData, "UTF-8");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setDoOutput(true);
		OutputStream os = conn.getOutputStream();
		os.write( encodedData.getBytes() );
		int response = conn.getResponseCode();
		if (response == HttpURLConnection.HTTP_MOVED_PERM
				|| response == HttpURLConnection.HTTP_MOVED_TEMP) {
			System.out.println("Moved to: "+ conn.getHeaderField("Location"));
		} else {
			try (InputStream in = conn.getInputStream()) {
				Files.copy(in, Paths.get("bbc.txt"),
						StandardCopyOption.REPLACE_EXISTING);
			}
		}

	}

}
