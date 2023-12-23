package java8.streamapi;

import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 4, 1, 5, 7, 0);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
