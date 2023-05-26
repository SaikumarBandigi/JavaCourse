package oops;

import java.util.*;

public class Final {

	public static boolean containsDuplicates(Integer[] numbers) {

		Set<Integer> numbersSet = new HashSet<>(Arrays.asList(numbers));
		System.out.println(numbersSet.size() + " " + numbers.length);

		if (numbersSet.size() != numbers.length) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Integer[] duplicates = { 1, 2, 3, 2 };
		Integer[] uniques = { 1, 2, 3 };
		System.out.println(containsDuplicates(duplicates)); // true
		System.out.println(containsDuplicates(uniques)); // false
	}
}