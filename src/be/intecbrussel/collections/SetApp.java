package be.intecbrussel.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		
		linkedlist.add("test1");
		linkedlist.add("test2");
		linkedlist.add("test3");
		linkedlist.add("test4");
		/*for (String string : linkedlist) {
			System.out.println(linkedlist);
		}*/
		
		// System.out.println(linkedlist.get(1));
		linkedlist.removeLast();
		System.out.println(linkedlist);
		Set<String> texts = new HashSet<>();
		texts.add("Hello ");
		texts.add("World");
		for (String string : texts) {
			System.out.println(string);
		}
		System.out.println(texts.size());

		texts.forEach(System.out::println);

	}

}
