package _17_stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class InventoryItem {
    public static void main(String[] args) {

        ///////////////////////////////////////////

//        List<Integer> integerList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        integerList.stream().filter(i -> (i & 1) == 0).forEach(System.out::println);


        ///////////////////////////////////

        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        Function<String, String> stringFunction = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        // Convert all words to uppercase using map
        List<String> uppercasedWords = words.stream()
                .map(stringFunction)
                .toList();

        System.out.println("Original words: " + words);
        System.out.println("Uppercased words: " + uppercasedWords);

//////////////////////////////////////////

        List<String> list1 = Arrays.asList("one", "two", "three");
        List<String> list2 = Arrays.asList("four", "five", "six");
        List<String> list3 = Arrays.asList("seven", "eight", "nine");

        List<List<String>> listOfLists = Arrays.asList(list1, list2, list3);


        Function<List<String>, Stream<String>> listStreamFunction = Collection::stream;

        // Using flatMap to flatten the nested lists
        List<String> flattenedList = listOfLists.stream()
                .flatMap(listStreamFunction)
                .toList();

        System.out.println("Original List of Lists: " + listOfLists);
        System.out.println("Flattened List: " + flattenedList);

    }
}
