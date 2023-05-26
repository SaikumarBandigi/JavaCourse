package arrays;

import java.util.Arrays;

public class ArraysdotToString {
	public static void main(String[] args) {

		// Declaration and Instantiation
		int a[] = new int[5];

		// Initialization
		for (int i = 0; i < 5; i++) {
			a[i] = i + 1;
		}

		System.out.println(Arrays.toString(a));

	}

}
