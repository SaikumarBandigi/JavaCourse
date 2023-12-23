package java8.methodreference;

public class Main1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Create a functional interface instance using a method reference
        IndexFinder indexFinder = String::indexOf;

        // Call the functional interface to find the index of "e"
        int index = indexFinder.findIndex(str, "e");

        System.out.println(index);

    }
}
@FunctionalInterface
interface IndexFinder {
    int findIndex(String str, String target);
}
