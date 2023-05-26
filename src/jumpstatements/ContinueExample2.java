package jumpstatements;

//Java Program to illustrate the use of continue statement  
//inside an inner loop  
public class ContinueExample2 {
	public static void main(String[] args) {
		// outer loop
		first: for (int i = 1; i <= 3; i++) {
			// inner loop
			second: for (int j = 1; j <= 3; j++) {
				if (i == 2 || j == 2) {
					// using continue statement inside inner loop
					continue first;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}