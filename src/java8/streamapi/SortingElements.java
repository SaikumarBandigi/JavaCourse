package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class SortingElements {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 2, 9, 1, 8, 3, 7, 4, 6, 8, 9, 10, 11, 12);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
