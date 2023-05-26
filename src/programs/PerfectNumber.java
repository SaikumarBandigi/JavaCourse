package programs;

public class PerfectNumber {
	public static void main(String[] args) {

		int n = 8128;

		boolean a = isPerfect(n);

		System.out.println(a);

	}

	private static boolean isPerfect(int n) {

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n)
			return true;

		return false;
	}

}
