package java_training.co.jp.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
	
	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		SortedSet<String> s = new TreeSet<String>();
		
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		
		System.out.println(s);
		
//		String first = s.first();
//		String last = s.last();
//		
//		SortedSet<String> tail = s.tailSet(first + '\0');
//		System.out.println(tail);
//		
//		SortedSet<String> tailTest = s.tailSet(first);
//		System.out.println(tailTest);
//		
//		SortedSet<String> tailTest1 = s.tailSet("2");
//		System.out.println(tailTest1);
//		
//		SortedSet<String> tailTest2 = s.tailSet("2" + '\0');
//		System.out.println(tailTest2);
		
//		SortedSet<String> head = s.headSet(last);
//		System.out.println("Header is : " +  head);
//		
//		SortedSet<String> headTest1 = s.headSet(last + '\0');
//		System.out.println(headTest1);
//		
//		SortedSet<String> headTest2 = s.headSet("3");
//		System.out.println(headTest2);
//		
//		SortedSet<String> headTest3 = s.headSet("3" + '\0');
//		System.out.println(headTest3);
//		
//		SortedSet<String> sub = s.subSet("2" + '\0', "4");
//		System.out.println(sub);
		
	}

}
