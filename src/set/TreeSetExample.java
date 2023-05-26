package set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
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