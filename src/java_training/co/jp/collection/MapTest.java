package java_training.co.jp.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("key", 2);
		System.out.println(map1);
		
//		Map<String, Integer> map2 = Collections.singletonMap("test1", -1);
//		System.out.println(map2);
////		map2.put("key2", -2);
//		
//		String[] words = { "this", "is", "a", "test" };
//		
//		for (int i = 0; i < words.length; i++) {
//			map1.put(words[i], i);
//		}
//		System.out.println(map1);
//		
//		for(int i = 0; i < words.length; i++) {
//			map1.put(words[i].toUpperCase(), i);
//		}
//		System.out.println(map1);
//		
//		map1.putAll(map2);
//		System.out.println(map1);
//		
//		Iterator<String> iter = map1.keySet().iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			System.out.print(key);
//			System.out.print(":");
//			System.out.println(map1.get(key));
//		}
//		
//		System.out.println("==============================");
//		
//		Iterator<Map.Entry<String, Integer>> iter1 = map1.entrySet().iterator();
//		while(iter1.hasNext()) {
//			Map.Entry<String, Integer> entry = iter1.next();
//			System.out.print(entry.getKey());
//			System.out.print(":");
//			System.out.println(entry.getValue());
//		}
//		
//		System.out.println(map1);
//		map1.keySet().remove("test1");
//		System.out.println(map1);
//		
//		Map<String, Integer> map3 = new HashMap<String, Integer>();
//		map3.put("test", 2);
//		
//		map1.keySet().remove(map3);
//		System.out.println(map1);
//		
//		map1.putAll(map3);
//		System.out.println(map1);
//		
//		map1.values().remove(2);
//		System.out.println(map1);
//		
//		map1.values().removeAll(Collections.singleton(2));
//		System.out.println(map1);
		
		
	}

}
