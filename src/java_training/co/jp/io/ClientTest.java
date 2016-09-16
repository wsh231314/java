package java_training.co.jp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String hostname = "www.example.com";
		int port = 80;
		String filename = "/index.html";
		try (Socket sock = new Socket(hostname, port);
				BufferedReader from = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				PrintWriter to = new PrintWriter(
						new OutputStreamWriter(sock.getOutputStream())); ) {

			to.print("GET " + filename +
					" HTTP/1.1\r\nHost: "+ hostname +"\r\n\r\n");
			to.flush();
			for(String l = null; (l = from.readLine()) != null; )
				System.out.println(l);
		}

	}

}
