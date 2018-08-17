package be.intecbrussel.Treeset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetApp {

	public static void main(String[] args) {

		System.out.println(askUserNumbers().first());
		System.out.println(askUserNumbers().last());
		
		
		
	}

	public static SortedSet<Integer> askUserNumbers() {

		SortedSet<Integer> numbers = new TreeSet<>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Lotto Game!");
		while (numbers.size() < 6) {
			System.out.println("Input a number: ");
			int userInput = keyboard.nextInt();
			if (userInput > 0 && userInput < 46) {
				numbers.add(userInput);
			} else {
				System.out.println("Bad Input!");
			}

		}

		return numbers;

	}
}
