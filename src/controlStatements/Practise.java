package controlStatements;

public class Practise {
	public static void main(String[] args) {

		// outer loop
		out: for (int i = 1; i <= 3; i++) {
			// inner loop
			in: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					// using break statement inside the inner loop
					break in;
				}
				System.out.println(i + " " + j);
			}

		}
	}
}