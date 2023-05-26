package _8series;

import java.util.Scanner;

public class Practise2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");
		int n = sc.nextInt();

		int rev = 0;
		int l = 0;

		for (; n != 0; n = n / 10) {
			l = n % 10;
			rev = rev * 10 + l;
		}

		System.out.println(rev);

	}
}
