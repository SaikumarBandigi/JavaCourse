package collection;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * if we want to use specific then use generics in angular bracket.
 * 
 * This Concept of what type of data we have in our collection is called as generics.
 * 
 * 
 * Collection<E> represents type of element you are working with.
 * 
 * Example: Integer
 * example: Student -> custom class with student parameters and methods      
 */

public class Collection2 {
	public static void main(String[] args) {
		Collection<Integer> values = new ArrayList();

		values.add(1);
		values.add(2);
		values.add(3);

		for (int i : values) // we can use int or Integer.
			System.out.println(i);
	}

}
