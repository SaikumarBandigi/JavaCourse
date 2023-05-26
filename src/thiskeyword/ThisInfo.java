package thiskeyword;


/*
 * Usage of Java this keyword
Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.


Suggestion: If you are beginner to java, lookup only three usages of this keyword.

variables,methods and constructors.

 */
public class ThisInfo {
	public static void main(String[] args) {

		A a = new A();

	}

}

class A {

	A() {
		this(5);
		System.out.println("sai kumar bandigi");
	}

	A(int x) {

		System.out.println("Prashanth");
	}

}