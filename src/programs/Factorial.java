package programs;

import java.util.Scanner;

/*
 * Factorial can be done in iteration or recursion method.
 * 
 * 
 */

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.println("enter a number");
		int num = sc.nextInt();

		int answer = fact(num);
		System.out.println(answer);

	}

	public static int fact(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;
	}

}
