package be.intecbrussel.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionApp {

	public static void main(String[] args) {
		
		Collection<String> myCollection = new ArrayList<>();
		
		
		
		myCollection.add("aaaa");
		myCollection.add("aaaa1");
		myCollection.add("aaaa2");
		myCollection.add("aaaa3");
		myCollection.add("aaaa4");
		myCollection.add("aaaa5");
		
		System.out.println(myCollection);
		
		for (String string : myCollection) {
			System.out.println(string.toUpperCase());
		}
		

	}

}
