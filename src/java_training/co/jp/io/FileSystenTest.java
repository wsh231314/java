package java_training.co.jp.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileSystenTest {

	public static void main(String[] args) throws IOException {
		
		Path base = Paths.get("C:\\\\Users\\\\shawn.shaohua.wang\\\\test\\\\test1.zip");
		
		try (FileSystem work = FileSystems.newFileSystem(base, null)) {
			Path add1 = work.getPath("./testadd.txt");
			List<String> content = new ArrayList<String>();
			content.add("hello");
			content.add("hello1");
			content.add("hello2");
			Files.write(add1, content, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
		}
		
	}
}
