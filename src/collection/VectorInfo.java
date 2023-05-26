package collection;

import java.util.Vector;



/*
 * vector increases it's capacity by 100%. if there are 9 elements its size is 9,capacity is 10.
 * 
 * if there are 12 elements its size is 12 and capacity is 20.
 * 
 * vector is Threadsafe and slow.
 * 
 */

public class VectorInfo {
public static void main(String[] args) {
	
	
	Vector<Integer> v = new Vector();
	
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add(5);
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add(5);
	v.add(5);
	
	System.out.println(v.capacity());
	System.out.println(v.size());
	
	System.out.println();
	
	for(int i: v)
		System.out.println(i);
	
}
}
