package java_training.co.jp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest {

	public static void main(String[] args) throws IOException {

		Path source = Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt");
		if (!Files.exists(source)) {
			Files.createFile(source);
		}
		
		Path target = Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test2.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		
		Path target1 = Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test3.txt");
		Files.copy(source, target1, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(target1);
		
		try (BufferedWriter bw = Files.newBufferedWriter(source)) {
			bw.write("test");
		}
		
		try (BufferedReader br = Files.newBufferedReader(source)) {
			System.out.println(br.readLine());
			try (BufferedReader br1 = Files.newBufferedReader(source)) {
				System.out.println(br1.readLine());
			}
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt")))) {
			System.out.println(br.readLine());
			try (BufferedReader br1 = new BufferedReader(new FileReader(new File("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.txt")))) {
				System.out.println(br1.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
