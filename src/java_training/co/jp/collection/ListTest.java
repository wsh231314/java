package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>(Arrays.asList(new String[]{"1", "2", "3", "4"}));
		List<String> words = Arrays.asList("hello", "world");

		String first = l.get(0); 
		String last = l.get(l.size() -1); 
		l.set(0, last); 
		
	    System.out.println(l);
		
		l.add(first); 
		System.out.println(l);
		l.add(0, first); 
		System.out.println(l);
		l.addAll(words); 
		System.out.println(l);
		l.addAll(1, words); 
		System.out.println(l);
		
		List<String> sub = l.subList(1,3);
		sub.set(0, "hi"); 
		System.out.println(sub);
		System.out.println(l);
		
		String subMin = Collections.max(l.subList(1, 4));
		System.out.println(subMin);
		
		Collections.sort(l.subList(0, 4));
		System.out.println(l);
		
		System.out.println(last);
		
		System.out.println(l.indexOf(last));
		System.out.println(l.lastIndexOf(last));
		
		String keyWord = "1";
		
		int p = 0;
		int n = l.size();
		do {
			
			List<String> subList = l.subList(p, n);
			int q = subList.indexOf(keyWord);
			
			if (q < 0) {
				break;
			}
			System.out.println("");
			System.out.printf("The key word is appered at %s:", p + q);
			
			p = p + q + 1;
			
		} while (p < n);

	}

}
