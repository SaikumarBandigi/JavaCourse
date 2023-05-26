package arrays;

public class Array1D {
	public static void main(String[] args) {

		int a[] = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
