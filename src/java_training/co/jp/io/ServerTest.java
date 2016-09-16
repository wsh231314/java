package java_training.co.jp.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	private static class HttpHandler implements Runnable {
		private final Socket sock;

		HttpHandler(Socket client) { 
			this.sock = client; 
		}

		public void run() {
			try (BufferedReader in =
					new BufferedReader(
							new InputStreamReader(sock.getInputStream()));
					PrintWriter out =
							new PrintWriter(
									new OutputStreamWriter(sock.getOutputStream())); ) {
				out.print("HTTP/1.0 200\r\nContent-Type: text/plain\r\n\r\n");
				String line;
				while((line = in.readLine()) != null) {
					if (line.length() == 0) break;
					out.println(line);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {

			int port = 9999;
			ServerSocket ss = new ServerSocket(port);
			for(;;) {
				Socket client = ss.accept();
				HttpHandler hndlr = new HttpHandler(client);
				new Thread(hndlr).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
