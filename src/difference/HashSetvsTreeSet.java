package difference;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashSet and TreeSet are both implementations of the Set interface in Java with some key differences:

Ordering: HashSet does not maintain any specific order of its elements, while TreeSet orders its elements
 based on their natural ordering or a custom Comparator provided during initialization.

Performance: HashSet offers better performance in general as it uses hash-based storage, allowing for 
constant-time complexity O(1) for insertion, deletion, and retrieval on average.
 TreeSet, on the other hand, maintains a balanced binary search tree, resulting in logarithmic time 
 complexity O(log n) for these operations.

Sorting: TreeSet automatically sorts its elements, making it suitable for scenarios where elements need to
 be sorted. HashSet does not provide any inherent sorting functionality.

Duplicate elements: HashSet allows null elements and permits duplicates (which are not stored) due to 
its hash-based implementation. TreeSet does not allow null elements and automatically eliminates duplicates
 based on the comparison criteria.

Iteration: HashSet provides faster iteration performance as it does not need to maintain a specific order.
 TreeSet, being sorted, offers additional methods for navigating the elements in a specific order.

In summary, if you need fast insertion, deletion, and retrieval operations, and the order of elements does 
not matter, HashSet is a good choice. If you require a sorted set or need to navigate the elements in a
 specific order, TreeSet would be more appropriate.
 */

public class HashSetvsTreeSet {
	public static void main(String[] args) {
		
		
//		Set<String> hashSet = new HashSet<>();
//
//        // Adding elements to the HashSet
//        hashSet.add("Apple");
//        hashSet.add("Banana");
//        hashSet.add("Orange");
//        hashSet.add("Mango");
//        hashSet.add("Pineapple");
//
//        // Printing the HashSet
//        System.out.println("HashSet: " + hashSet);
//
//        // Checking if an element exists
//        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
//
//        // Removing an element
//        hashSet.remove("Orange");
//
//        // Printing the HashSet after removal
//        System.out.println("HashSet after removal: " + hashSet);
//
//        // Iterating over the HashSet
//        System.out.println("Iterating over HashSet:");
//        for (String fruit : hashSet) {
//            System.out.println(fruit);
//        }
		
		/////////////////////////////
		
		
		
		TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(4);

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists
        System.out.println("Contains 2: " + treeSet.contains(2));

        // Removing an element
        treeSet.remove(8);

        // Printing the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Iterating over the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
		
		
	}
}
