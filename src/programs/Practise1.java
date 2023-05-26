package programs;

// Fibonacci -> 0 1 1 2 3 5 8 13 21 34     

//fib(5) is fib(4)+fib(3)

public class Practise1 {
	public static void main(String[] args) {

		int num = 9;
		int result = fib(num);
		System.out.println(result);
	}

	public static int fib(int num) {

		if (num == 0)
			return 0;

		if (num == 1)
			return 1;

		return fib(num - 1) + fib(num - 2);
	}

}
