package java_training.co.jp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOTest {

	public static void main(String[] args) {

		File base = new File(System.getProperty("user.home").concat(System.getProperty("file.separator")).concat("test"));
		
		File test1 = new File(base, "testfile1.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(test1))) {
			Scanner in = new Scanner(System.in);
			System.out.println("inout the file context! and input Q to quit!");
			String inLine = in.nextLine();
			while (!inLine.equalsIgnoreCase("q")) {
				br.write(inLine);
				br.write(System.getProperty("line.separator"));
				inLine = in.nextLine();
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(test1))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
