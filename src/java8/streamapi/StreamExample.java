package java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Predicate<Integer> predicate = integer -> (integer & 1) == 0;
//        Function<Integer, Integer> function = integer -> integer * 2;


        List<Integer> doubledEvens = numbers.stream().filter(integer -> (integer & 1) == 0).map(integer -> integer * 2).collect(Collectors.toList());
        System.out.println(doubledEvens); // Output: [4, 8, 12, 16, 20]

    }
}
