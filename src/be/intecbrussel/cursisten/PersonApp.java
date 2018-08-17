package be.intecbrussel.cursisten;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PersonApp {

	public static void main(String[] args) {
		
		

		Set<Person> persons = new HashSet();
		
		persons.add(new Person("Intec", "Brussel", "Male", 43, 110, 175));

		for (Person person : persons) {
			System.out.println(person);
		}
		
		NewStudent();
		

	}
	
	public int compare(Person person1, Person person2) {
		
		int compareResult = ((Integer)(person1.getAge())).compareTo(person2.getAge());
		
		if(compareResult ==0) {
			return -1;
			
		}else {
			return compareResult;
		}
		
	}

	private static void NewStudent() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many student?: ");
		int num = keyboard.nextInt();
		NavigableMap<String, Person> persons = new TreeMap<>();
		
		while(persons.size() < num) {
			
			System.out.println("FirstName: ");
			String firstName = keyboard.next();
			System.out.println("lastName: ");
			String lastName = keyboard.next();
			System.out.println("Gender: ");
			String gender = keyboard.next();
			System.out.println("age: ");
			int age = keyboard.nextInt();
			System.out.println("weight: ");
			int weight = keyboard.nextInt();
			System.out.println("height: ");
			int height = keyboard.nextInt();
			Person person1 = new Person(firstName, lastName, keyboard.next(), age, weight, height);
			System.out.println(person1);
			
			
			
		}
		
		
	}
}
