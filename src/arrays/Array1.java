package arrays;

public class Array1 {
	public static void main(String[] args) {

		// Array is collection of elements
		// System.out.println(a); then we are printing array not elements so we get hashcode.
		

		// Declaration and Instantiation
		int a[] = new int[5];

		// Initialization
		for (int i = 0; i < 5; i++) {
			a[i] = i + 1;
		}

		// printing the values
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}
}
