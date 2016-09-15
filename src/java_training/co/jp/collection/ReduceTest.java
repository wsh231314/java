package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {
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

		Object result = unitList.stream().reduce(new TestUnit(), (x, y) -> {if (x.getAge() > y.getAge()) return x; return y;});
		System.out.println(result);

		String[] billyQuotes = {"For Brutus is an honourable man"};
		
		List<String> quotes = Arrays.asList(billyQuotes);
		// 
		List<String> words = quotes.stream()
				.flatMap(line -> Stream.of(line.split(" +")))
				.collect(Collectors.toList());
		long wordCount = words.size();
		
		List<String> words1 = quotes.stream().flatMap(line -> Stream.of(line.split(" +"))).collect(Collectors.toList());
		
		System.out.println("Average word length: " + wordCount);
		// 
		double aveLength = ((double) words.stream()
				.map(String::length)
				.reduce(0, (x, y) -> {return x + y;})) / wordCount;
		System.out.println("Average word length: " + aveLength);
	}

}
