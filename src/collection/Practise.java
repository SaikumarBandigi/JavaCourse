package collection;

import java.util.ArrayList;
import java.util.List;

public class Practise {
	public static void main(String[] args) {

		List<Integer> values = new ArrayList();

		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);

		values.add(1, 100);

		for (int i : values)
			System.out.println(i);

	}
}
