package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_for_Nested_Lists {
    public static void main(String[] args) {


        List<List<String>> nestedLists = List.of(
                List.of("apple", "banana"),
                List.of("cherry", "date", "fig"),
                List.of("grape")
        );



        List<String> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [apple, banana, cherry, date, fig, grape]


    }
}
