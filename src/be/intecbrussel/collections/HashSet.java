package be.intecbrussel.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> al = new LinkedHashSet<Integer>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me 6 different number between 1-45");
		for (int i = 0; i < 6; i++) {
			System.out.println("enter " + (i + 1) + "th number please: ");
			al.add(keyboard.nextInt());
		}
		
		printLotto(al);

	}
	private static void printLotto(LinkedHashSet al) {
		
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			
			System.out.print(" " + itr.next());
		}
	}

}
