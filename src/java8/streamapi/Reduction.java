package java8.streamapi;

import java.util.List;
import java.util.function.BiFunction;

public class Reduction {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
