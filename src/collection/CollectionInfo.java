package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * collection Collection Collections
 * 
 * collection is a concept.
 * Collection is an interface.
 * Collections is a class.
 * 
 * Collection doesn't work with index.(we can add element but we can't add element in between elements)
 * we can't even sort the elements because there is no index.
 * 
 * so we go for List interface
 * 
 * Note: we can't create object of an interface. so, we need to search for a class which implements 
 * this interface or we need to search for a method which gives instance of this interface.
 * 
 */
public class CollectionInfo {
	public static void main(String[] args) {

		Collection values = new ArrayList(); // Since collection is an interface we can't create object
												// arraylist provides implementation for this interface

		// we created reference of Collection(interface) as values and created object of
		// ArrayList.

		values.add(1);
		values.add("sai kumar");

		Iterator itr = values.iterator(); // iterator() is the method in Collection interface which gives
											// instance of Iterator.

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// System.out.println(itr.next());

	}
}
