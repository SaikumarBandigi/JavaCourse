package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterating_Collection_through_remaining_ways {
	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("d");
		arrlist.add("dd");
		arrlist.add("ddd");
		arrlist.add("dddd");
		arrlist.add("ddddd");
		System.out.println(arrlist);
		
//////////////// By for-each loop.

//for(String i:arrlist)
//	System.out.println(i);
		
		

///////////////////////// By Iterator interface.		
//	Iterator<String> itr = arrlist.iterator();
//
//	while (itr.hasNext()) {
//		System.out.println(itr.next());
//	}
		
		

		//////////////////// By ListIterator interface.
//		ListIterator<String> itr = arrlist.listIterator(3);
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		
		
		
		///////////////// By for loop.		
//		for(int i=0;i<arrlist.size();i++)  
//        {  
//         System.out.println(arrlist.get(i));     
//        }
		
		
		
		/////////////// By forEach() method.
		 //The forEach() method is a new feature, introduced in Java 8.  
//		arrlist.forEach(a->{ //Here, we are using lambda expression  
//            System.out.println(a);  
//          });  
		
		
		
		
		/////////////// By forEachRemaining() method. 
        Iterator<String> itr=arrlist.iterator();  
        itr.forEachRemaining(a-> //Here, we are using lambda expression  
        {  
      System.out.println(a);  
        }); 
		
		
	}
}
