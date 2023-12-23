package java8.parallelsort;

import java.util.Arrays;

public class ParallelArraySortingExample {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 2, 7, 1, 6, 4};

        // Parallel sort the array
        Arrays.parallelSort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
