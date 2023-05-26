package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {

		/*
		 * in array by mentioning datatype as Object we can values integer and String
		 * but it is fixed. That's why we use Collection.
		 * 
		 * 
		 */

//	Object[] a = new Object[5];
//	
//	a[0]=1;
//	a[1]="sonu";
//	
//	for( Object i:a)
//		System.out.println(i);

		////////////////////////

		Collection values = new ArrayList();

		values.add(1);
		values.add("Bandigi");

		values.remove(1);

		for (Object i : values)
			System.out.println(i);

	}
}
