package be.intecbrussel.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp {

	public static void main(String[] args) {

		intListMethod();
		/*
		 * List<String> names = new ArrayList<>(); // siralamayi daha duzgun yapti.
		 * names.add("Bart"); names.add("Patrick"); names.add("Alex"); //
		 * names.add(0,"Wouter"); for (String string : names) {
		 * System.out.println(string); System.out.println(string.substring(1, 2)); }
		 * 
		 * String a = "Admin"; names.add(a); System.out.println(names);
		 * 
		 * names.forEach(System.out::println);
		 */

	}

	private static void fillList(Scanner input, List<Integer> num) {
		System.out.println("How many numbers will you be entering?");
		int length = input.nextInt();
		for (int i = 0; i < length; i++) {
			System.out.println("enter " + (i + 1) + "th number please: ");
			num.add(input.nextInt());
		}

	}

	private static void printSum(List<Integer> num) {
		int sum = 0;
		for (int integer : num) {
			sum += integer;
		}
		System.out.println("sum: " + sum);
	}
	
	private static void printAverage(List<Integer> num) {
		int sum = 0;
		for (int integer : num) {
			sum += integer;
		}
		double ave =((double)sum)/num.size();
		System.out.println("Average:"+ ave);
	}

	private static void intListMethod() {
		Scanner input = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		fillList(input, num);
		printList(num);
		printSum(num);
		printAverage(num);
	}

	private static <E> void printList(List l) {
		for (Object object : l) {
			System.out.print("\n" + object);
			System.out.println(l);
		}

	}

}
