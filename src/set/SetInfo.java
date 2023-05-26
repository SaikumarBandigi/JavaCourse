package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * The set is an interface available in the java.util package. 
 * The set interface extends the Collection interface. 
 * An unordered collection or list in which duplicates are not allowed is referred to as a collection interface.
 * The set interface is used to create the mathematical set.
 * The set interface use collection interface's methods to avoid the insertion of the same elements.
 * SortedSet and NavigableSet are two interfaces that extend the set implementation.
 *  
 *  
 *  Hashset uses concept of hashing. when you put elements into heap memory it goes into certain locations
 *  it uses some algorithm using which nearest value will come first.sequence is not maintained.  
 *  
 *  
 *  for acsending order use treeset.
 */

public class SetInfo {
	public static void main(String[] args) {

		Set<Integer> values = new HashSet<>();

		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(9);

		for (int i : values)
			System.out.println(i);

	}
}
