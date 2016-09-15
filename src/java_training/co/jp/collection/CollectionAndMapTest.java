package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionAndMapTest {
	
	public static void main(String args[]) {
		
		String[] fromArray = new String[]{"1", "2", "3", "4", "5", "6"};
		
		List<String> list = Arrays.asList(fromArray);
		
		List<String> bigger2 = list.stream().filter(s -> Integer.parseInt(s) > 2).collect(Collectors.toList());
		System.out.println(bigger2);
		
		List<String> bigger2_2 = list.parallelStream().filter(s -> Integer.parseInt(s) > 2).collect(Collectors.toList());
		System.out.println(bigger2_2);
		
		// lambda test
		TestUnit wsh = new TestUnit();
		wsh.setName("wsh");
		wsh.setAge(20);

		TestUnit wsh1 = new TestUnit();
		wsh1.setName("wsh1");
		wsh1.setAge(21);

		TestUnit wsh2 = new TestUnit();
		wsh2.setName("wsh2");
		wsh2.setAge(22);
		
		List<TestUnit> unitList = new ArrayList<TestUnit>();
		unitList.add(wsh);
		unitList.add(wsh1);
		unitList.add(wsh2);
		
		System.out.println(unitList);
		unitList.stream().forEach(s -> s.resetName());
		System.out.println(unitList);
		unitList.spliterator().forEachRemaining(TestUnit::resetName);
		System.out.println(unitList);
		
		
	}

}
