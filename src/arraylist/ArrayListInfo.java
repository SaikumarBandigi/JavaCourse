package arraylist;

import java.util.ArrayList;

/*
 * ArrayList increases by 50%. Non-Threadsafe and fast.
 * 
 * ArrayList has size method.
 * 
 * The important points about the Java ArrayList class are:

*Java ArrayList class can contain duplicate elements.
*Java ArrayList class maintains insertion order.
*Java ArrayList class is non synchronized.
*Java ArrayList allows random access because the array works on an index basis.

*In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a
 lot of shifting needs to occur if any element is removed from the array list.
 
*We can not create an array list of the primitive types, such as int, float, char, etc.
 It is required to use the required wrapper class in such cases. For example:
 
 ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
 * 
 * 
 */
public class ArrayListInfo {
	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();

		values.add(20);
		values.add(10);
		values.add(3);
		values.add(1);

		System.out.println(values.size());
		System.out.println(values.contains(20));

		System.out.println();

		for (int i : values)
			System.out.println(i);

	}
}
