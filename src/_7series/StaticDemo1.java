package _7series;

/*
* Why Non-Static variables does not work in Static method in Java? 
 */

public class StaticDemo1 {

	static int i = 8;

	public static void main(String a[]) {

		i++;
		System.out.println(i);

	}
}
