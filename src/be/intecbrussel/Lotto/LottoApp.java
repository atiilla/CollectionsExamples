package be.intecbrussel.Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoApp {

	public static void main(String[] args) {

		Set<Integer> userNumbers = askUserNumbers();
		Set<Integer> LottoNumbersWithRandomObject = generateLottoNumbers();
		System.out.println(userNumbers);
		System.out.println(userNumbers.size());
		System.out.println(userNumbers.toString());

		System.out.println(LottoNumbersWithRandomObject); // lotto numbers using Random Object
		userNumbers.retainAll(LottoNumbersWithRandomObject);
		Set<Integer> correctNumbers = userNumbers;
		
		TreeSet<Integer> tset = new TreeSet<Integer>(correctNumbers); 
		System.out.println(tset.first());
		

		//System.out.println("Correct Numbers: " + correctNumbers.size());
		/*
		 * / LinkedHashSet<Integer> al = new LinkedHashSet<Integer>(); Scanner keyboard
		 * = new Scanner(System.in);
		 * System.out.println("Give me 6 different number between 1-45"); for (int i =
		 * 0; i < 6; i++) { System.out.println("enter " + (i + 1) +
		 * "th number please: "); al.add(keyboard.nextInt()); }
		 * 
		 * printLotto(al);
		 * 
		 * } private static void printLotto(LinkedHashSet al) {
		 * 
		 * Iterator<Integer> itr = al.iterator(); while (itr.hasNext()) {
		 * 
		 * System.out.print(" " + itr.next()); }
		 */

	}

	// lotto numbers using Random Object
	public static Set<Integer> generateLottoNumbers() {
		Set<Integer> LottoNumbers = new HashSet<>();
		Random gen = new Random();
		while (LottoNumbers.size() < 6) {
			LottoNumbers.add(gen.nextInt(45) + 1);
		}
		return LottoNumbers;
	}

	// lotto numbers - asking user
	public static Set<Integer> askUserNumbers() {

		Set<Integer> numbers = new HashSet<>();
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
