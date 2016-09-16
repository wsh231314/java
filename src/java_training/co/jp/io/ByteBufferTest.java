package java_training.co.jp.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class ByteBufferTest {

	public static void main(String[] args) throws IOException {

		ByteBuffer b = ByteBuffer.allocateDirect(10 * 1024 * 1024);
		
		try (FileInputStream ifs = new FileInputStream(Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt").toFile())) {
			FileChannel fc = ifs.getChannel();
			fc.read(b);
			System.out.println(b);
		}
	}

}
