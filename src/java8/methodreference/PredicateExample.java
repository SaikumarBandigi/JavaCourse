package java8.methodreference;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicate = integer -> (integer & 1) == 0;
        list.stream().filter(predicate).forEach(System.out::println);


    }
}
