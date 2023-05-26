package collection;


import java.util.*;

/*
 * List works with how we inserted, to get sorted form we use Collections.sort
 * 
 * 
 */

public class List1 {
public static void main(String[] args) {
	
	List<Integer> values = new ArrayList();
	
	values.add(20);
	values.add(10);
	values.add(1);
	values.add(99);
	values.add(33);
	
	Collections.sort(values);
	

	
	//values.forEach(num->System.out.println(num));
	
	values.forEach(System.out::println);
	
//	for(int i:values)
//		System.out.println(i);
	
}
}
