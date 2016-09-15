package java_training.co.jp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		String[] array = new String[] {"tiger", "cat", "TIGER", "Tiger", "leopard"};

		List<String> list = Arrays.asList(array);

		list.stream().forEach(s -> System.out.println(s));

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
		unitList.stream().forEach(TestUnit::resetName);
		System.out.println(unitList);
	}

}
