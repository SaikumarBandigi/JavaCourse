package java8.collectorspack;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToListExample {
    public static void main(String[] args) {

        // Create a stream of strings
        Stream<String> stringStream = Stream.of("apple", "banana", "cherry", "date", "fig");

        // Create a reference to the Collectors.toList() collector
        Collector<String, ?, List<String>> toListCollector = Collectors.toList();

        // Collect the elements into a List using the reference
        List<String> stringList = stringStream.collect(toListCollector);

        // Print the List
        System.out.println(stringList);


    }
}

