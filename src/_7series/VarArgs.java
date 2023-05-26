package _7series;

public class VarArgs {
	public static void main(String[] args) {

		// if there are two method one is varargs and one one normal method then it
		// takes exact method.

		Display d = new Display();
		// d.show(4, 5);
		d.show(1);

	}

}

class Display {
	public void show(int a) {
		System.out.println(a);
	}

	public void show(int... i) {
		for (int a : i) {
			System.out.println(a);
		}
	}

}

/*

In summary, the combination of the JVM, platform-independent APIs and libraries, 
and the portability of the Java language make Java a platform-independent programming language.


*/

