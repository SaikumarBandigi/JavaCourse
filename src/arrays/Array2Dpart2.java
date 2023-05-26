package arrays;

public class Array2Dpart2 {
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}
}
