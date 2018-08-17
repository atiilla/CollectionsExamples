package be.intecbrussel.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		que.offer("Hello");
		que.offer("World");
		
		// Handling queue
		String a = que.peek();
		while(a !=null) {
			System.out.println("About the handle " + a);
			a = que.poll();
			System.out.println("Handling " + a);
			a = que.peek();
		}
		
		for (String string : que) {
			System.out.println(string);
		}

	}

}
