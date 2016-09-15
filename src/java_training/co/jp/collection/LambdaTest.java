package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
	
	public static void main(String args[]) {
		
		String[] array = new String[] {"tiger", "cat", "TIGER", "Tiger", "leopard"};
		
		List<String> list = Arrays.asList(array);
		
		String result = list.stream().filter(s -> s.equalsIgnoreCase("tiger")).collect(Collectors.joining(","));
		
		System.out.println(result);
		
		Predicate<String> animals = s -> s.equals("cat");
		Predicate<String> animal1 = animals.or(s -> s.equals("leopard"));
		Predicate<String> animal2 = animal1.and(s -> s.length() > 4);
		System.out.println(list);
		String result1 = list.stream().filter(animal2).collect(Collectors.joining(","));
		System.out.println(result1);
		
		
		String[] map = new String[] {"tiger", "cat", "TIGER", "Tiger", "leopard"};
		List<String> mapList = Arrays.asList(map);
		List<Integer> newList = mapList.stream().map(String::length).collect(Collectors.toList());
		System.out.println(newList);
		
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
		
		//
		List<TestUnit> unitList = new ArrayList<TestUnit>();
		unitList.add(wsh);
		unitList.add(wsh1);
		unitList.add(wsh2);
		
		List<TestUnit> newArray = unitList.stream().filter(s -> s.getName().equals("wsh")).collect(Collectors.toList());
		System.out.println(newArray);
		
		List<String> resultx = unitList.stream().map(TestUnit::toString).collect(Collectors.toList());
		System.out.println(resultx);
		
	}
}
