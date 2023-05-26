package method_Overriding;

public class PostandPreIncrement4_5 {
	public static void main(String[] args) {

		/*
		 * 
		 * i=i+1; -> i+=1; -> i++(post increment) -> ++i(pre increment1) (same)
		 * 
		 * 
		 * assignment operators,shorthand operators and post,pre increment
		 * 
		 * safe with assignment and shorthand
		 */

//		int i = 5;
//
//		i = i++;
//		System.out.println(i);

		///

//		int i = 5;
//		i++;
//		System.out.println(i);

		///

//		int j = 10;
//		j = ++j;
//		System.out.println(j);

		///

//		int k = 20;
//		k = k + 1;
//		System.out.println(k);

		///
//		int i = 5;
//
//		i = ++i;
//		System.out.println(i);

		///

//		int b = 5;
//
//		int c = ++b;
//		System.out.println(c + " " + b);

		///

//		int d = 5;
//		int e = d++;
//		System.out.println(e + " " + d);

		//// important

//		int i = 5;
//
//		int temp;
//		temp = i;
//		i++;
//		i = temp;
//
//		i = i++; // 63 line is similar to 59,60,61
//
//		System.out.println(i);

		int i = 5;

		int temp;
		temp = i;
		++i;
		i = temp;

		System.out.println(i + " " + i);

	}

}
