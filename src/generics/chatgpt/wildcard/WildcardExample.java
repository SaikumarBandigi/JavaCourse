package generics.chatgpt.wildcard;

import java.util.LinkedList;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {

        ///////////////////////////////

        List<Number> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        addNumbers(integerList);

        ///////////////////////////////
        printListContents(integerList);
        ///////////////////////////////
        addInteger(integerList,1);



    }

    // Upper-bounded wildcard: Accepts a list of any type that extends Number
    public static void addNumbers(List<? extends Number> list) {
        // Can read from the list
        for (Number number : list) {
            System.out.println(number);
        }

        // Cannot add elements to the list (except null)
        // list.add(10); // Compile-time error
        // list.add(3.14); // Compile-time error
    }

    // Unbounded wildcard: Can work with a list of any type, but can only read from it
    public static void printListContents(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }

        // Cannot add elements to the list (except null)
        // list.add("Hello"); // Compile-time error
    }

    // Lower-bounded wildcard: Accepts a list of Integer or any super type of Integer
    public static void addInteger(List<? super Integer> list, Integer value) {
        // Can add elements to the list
        list.add(value);
    }

}

// wildcard entry are
// ?
// ? extends T
// ? super T


