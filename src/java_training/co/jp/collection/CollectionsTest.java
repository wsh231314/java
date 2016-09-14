package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	
	public static void main(String args[]) {
		
		List<Integer> primes = new ArrayList<Integer>();
		
		List<Integer> readonly = Collections.unmodifiableList(primes);
		
		primes.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		System.out.println(primes);
		System.out.println(readonly);
		
		//readonly.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		
		System.out.println(Collections.binarySearch(readonly, 5));
		
		Collections.copy(primes, readonly);
		System.out.println(primes);
		System.out.println(readonly);
		
		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(Arrays.asList(1, 2, 4, 19, 20));
		Collections.copy(primes, copy);
		System.out.println(primes);
		System.out.println(readonly);
		
		Collections.fill(copy, 2);
		System.out.println(copy);
		System.out.println(primes);
		
		Collections.sort(primes);
		System.out.println(primes);
		
		System.out.println(Collections.max(primes));
		System.out.println(Collections.min(primes));
	}

}
