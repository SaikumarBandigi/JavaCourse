package java8.streamapi;

import java.util.List;

public class Reduce_to_Find_Maximum_Value {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(8, 2, 6, 4, 10, 3);
        int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Maximum value: " + max); // Output: Maximum value: 10

    }
}
