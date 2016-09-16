package java_training.co.jp.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileTest {
	
	public static void main(String args[]) {
		
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("file.separator"));
		
		File homeDir = new File(System.getProperty("user.home"));
		
		File testFile = new File(homeDir, "test");
		
		if (testFile.exists()) {
			System.out.println("user.home");
		} else {
			System.out.println("Not exists!");
			testFile.mkdir();
			System.out.println(testFile.exists());
		}
		
		File base = new File(System.getProperty("user.home").concat(System.getProperty("file.separator")).concat("test"));
		
		if (!base.exists()) {
			System.out.println("error!");
		}
		
		File test1 = new File(base, "testfile1.txt");
		try {
			test1.createNewFile();
			
			
			test1.renameTo(new File(base, "testfile2.txt"));
			test1.createNewFile();
			
			List<File> fileList = Arrays.asList(base.listFiles());
			System.out.println(fileList);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
