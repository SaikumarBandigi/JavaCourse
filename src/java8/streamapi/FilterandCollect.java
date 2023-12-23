package java8.streamapi;

import java.util.List;
import java.util.function.Predicate;

public class FilterandCollect {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva", "Frank");

        Predicate<String> predicate = s -> s.length() < 4;

        List<String> strings = names.stream().filter(s -> s.length() < 4).toList();
        System.out.println(strings);

    }
}
