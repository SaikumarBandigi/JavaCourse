package _7series;

/*

* if it is static method (in same class) can call directly with method name.
* if it is static method (in another class) can call with class name and method name.
* if a variable(instance) is declared as a static it can be used inside the non static method.
* if a variable(instance) is declared as a non-static it cannot be used inside the  static method.


* static is a keyword used in java with the member functions or member variables
  of your class. so that, you can call those members without using the object or
  we don't need to instantiate any class to call those members.  


 */

public class StaticDemo {
	public static void main(String[] args) {

		Sai s = new Sai();
		s.show();

	}
}

class Sai {

	static int i = 10;

	public static void show() {
		System.out.println("SAI KOMAL");
		System.out.println(i);
	}
}