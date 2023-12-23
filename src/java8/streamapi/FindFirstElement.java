package java8.streamapi;

import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {

        List<String> names = List.of("Bob", "ALic", "Charlie", "David", "Eva");

        String firstName = names.stream()
                .findFirst()
                .orElse("No name found");

        System.out.println("First name: " + firstName); // Output: First name: Alice

    }
}
