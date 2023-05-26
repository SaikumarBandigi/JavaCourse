package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * 
 * How to sort HashSet in Java
 */

public class HashSetTrick {
	public static void main(String[] args) {

		// Creating a HashSet
		HashSet<String> set = new HashSet<String>();

		// Adding elements into HashSet using add()
		set.add("geeks");
		set.add("practice");
		set.add("contribute");
		set.add("ide");

		List<String> values = new ArrayList<String>(set);

		Collections.sort(values);

		for (String i : values)
			System.out.println(i);

	}
}
