package programs;

public class Program {
	interface Calculator {
		double operation(int a, int b);
	}

	public double operations(int a, int b, Calculator c) {
		return c.operation(a, b);
	}

	public static void main(String[] args) {

		Program p = new Program();
		Calculator add = (a, b) -> (a + b);
		System.out.println(p.operations(100, 200, add));
	}
}