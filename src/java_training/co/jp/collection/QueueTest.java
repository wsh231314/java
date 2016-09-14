package java_training.co.jp.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
//		Queue<String> linked = new LinkedList<String>();
//		
//		linked.add("1");
//		linked.add("2");
//		linked.add("3");
//		linked.add("4");
//		
//		linked.offer("5");
//		linked.offer("6");
//		
////		linked.put("7");
////		linked.put("8");
//		
//		System.out.println(linked);
//		
//		System.out.println(linked.element());
//		System.out.println(linked.peek());
//		
//		System.out.println(linked);
//		
//		//[1, 2, 3, 4, 5, 6]
//		linked.remove();
//		System.out.println(linked);
//		//[2, 3, 4, 5, 6]
//		linked.poll();
//		System.out.println(linked);
////		linked.take();
////		System.out.println(linked);
//		//[3, 4, 5, 6]
//		linked.remove();
//		System.out.println(linked);
//		//[4, 5, 6]
//		linked.poll();
//		System.out.println(linked);
//		//[5, 6]
//		linked.remove();
//		System.out.println(linked);
//		// [6]
//		linked.poll();
//		System.out.println(linked);
//		// []
//		linked.poll();
//		System.out.println(linked);
//		// []
//		linked.remove();
//		System.out.println(linked);
		
		Queue<String> priority = new PriorityQueue<String>();
		
		priority.add("1");
		priority.add("2");
		priority.add("3");
		priority.add("4");
		
		priority.offer("5");
		priority.offer("6");
		
//		priority.put("7");
//		priority.put("8");
		
		System.out.println(priority);
		
		System.out.println(priority.element());
		System.out.println(priority.peek());
		
		System.out.println(priority);
		
		//[1, 2, 3, 4, 5, 6]
		priority.remove();
		System.out.println(priority);
		//[2, 3, 4, 5, 6]
		priority.poll();
		System.out.println(priority);
//		priority.take();
//		System.out.println(priority);
		//[3, 4, 5, 6]
		priority.remove();
		System.out.println(priority);
		//[4, 5, 6]
		priority.poll();
		System.out.println(priority);
		//[5, 6]
		priority.remove();
		System.out.println(priority);
		// [6]
		priority.poll();
		System.out.println(priority);
		// []
		priority.poll();
		System.out.println(priority);
		// []
		priority.remove();
		System.out.println(priority);
		
	}

}
