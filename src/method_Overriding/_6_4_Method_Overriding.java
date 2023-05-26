package method_Overriding;

class A {

	void show() {
		System.out.println("A class");
	}

}

class B extends A {

	@Override
	void show() {

		System.out.println("B Class");
	}

}

public class _6_4_Method_Overriding

{

	public static void main(String[] args) {

		B b = new B();
		b.show();

	}

}
