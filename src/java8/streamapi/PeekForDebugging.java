package java8.streamapi;

import java.util.List;
import java.util.function.Consumer;

public class PeekForDebugging {
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "cherry", "date");

//        Consumer<String> consumer = fruit -> System.out.println("Processing: " + fruit);
//        Function<String, String> function = String::toUpperCase;

        Consumer<String> consumer1 = s -> System.out.println(s);

        fruits.stream()
                .peek(fruit -> System.out.println("Processing: " + fruit))
                .map(String::toUpperCase)
                .toList().forEach(consumer1);


    }
}
