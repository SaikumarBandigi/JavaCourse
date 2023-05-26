package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Practise {
	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("d");
		arrlist.add("dd");
		arrlist.add("ddd");
		arrlist.add("dddd");
		arrlist.add("ddddd");
		System.out.println(arrlist);
		
		
		Collections.sort(arrlist);
////////////////

//	for(String i:arrlist)
//		System.out.println(i);

/////////////////////////
//		Iterator<String> itr = arrlist.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		ListIterator<String> itr = arrlist.listIterator(3);
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}
}
