package programs;

import java.util.HashMap;
import java.util.Map;

// 0 1 1 2 3 5 8 13 21 34 

public class FibonnaciMemoization {
	private static Map<Integer, Integer> values = new HashMap<>();

	public static void main(String[] args) {

		int pos = 8;

		int result = fib(pos);
		System.out.println(result);

	}

	public static int fib(int pos) {

		if (pos == 0)
			return 0;

		if (pos == 1 || pos == 2) 
			return 1;

		if (values.containsKey(pos))
			return values.get(pos);

		int answer = fib(pos - 1) + fib(pos - 2);
		values.put(pos, answer);
		return answer;
	}

}
