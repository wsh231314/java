package java_training.co.jp.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.util.concurrent.Future;

public class AsynchronousFileChannelTest {

	public static void main(String[] args) throws IOException {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt")))) {
			for (int i = 0; i <= 20000000; i++) {
				bw.write("test test test!".concat("\r\n"));
			}
		}

		try (AsynchronousFileChannel afc = AsynchronousFileChannel.open(Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt"))) {
			ByteBuffer b = ByteBuffer.allocateDirect(10 * 1024 * 1024);
			Future<Integer> f = afc.read(b, 0);
			
			while (!f.isDone()) {
				System.out.println("I'm doing something!");
			}
		}
	}

}
