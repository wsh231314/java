package java_training.co.jp.collection;

import java.util.Arrays;

public class ArraysTest {
	
	public static void main(String args[]) {
		
		String[] fromArray = new String[]{"1", "2", "3", "4", "5", "6"};
		System.out.println(Arrays.asList(fromArray));
		
		System.arraycopy(fromArray, 4, fromArray, 2, 2);
		System.out.println(Arrays.asList(fromArray));
		
		System.out.println(Arrays.binarySearch(fromArray, "5"));
		
		Arrays.fill(fromArray, "a");
		System.out.println(Arrays.asList(fromArray));
		
		Arrays.fill(fromArray, 2, 4, "b");
		System.out.println(Arrays.asList(fromArray));
	}

}
