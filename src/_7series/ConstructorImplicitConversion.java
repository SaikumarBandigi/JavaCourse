package _7series;

public class ConstructorImplicitConversion {

	/*
	 * if you pass int., it can store in double
	 */

	public ConstructorImplicitConversion() {
		System.out.println("default");
	}

//	public ConstructorImplicitConversion(int a) {
//		System.out.println("int constructor");
//	}

	public ConstructorImplicitConversion(double d) {
		System.out.println("double constructor");
	}

	public static void main(String[] args) {

		// ConstructorImplicitConversion c = new ConstructorImplicitConversion();

		// ConstructorImplicitConversion c = new ConstructorImplicitConversion(1);

		ConstructorImplicitConversion c = new ConstructorImplicitConversion(5);

	}
}
