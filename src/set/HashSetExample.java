package set;

import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		// Adding elements to the HashSet
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Mango");
		hashSet.add("Pineapple");

		// Printing the HashSet
		System.out.println("HashSet: " + hashSet);

		// Checking if an element exists
		System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

		// Removing an element
		hashSet.remove("Orange");

		// Printing the HashSet after removal
		System.out.println("HashSet after removal: " + hashSet);

		// Iterating over the HashSet
		System.out.println("Iterating over HashSet:");
		for (String fruit : hashSet) {
			System.out.println(fruit);
		}
	}
}
