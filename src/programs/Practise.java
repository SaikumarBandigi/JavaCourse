package programs;

public class Practise {
	public static void main(String[] args) {

		System.out.println(Z.display(10, 10));

		C c = new C();
		// c.show();
		c.add();

	}
}

interface Z {
	static int display(int a, int b) {

		int c = a + b;

		return c;
	}

	default void show() {
		System.out.println("BANDIGI SAI KUMAR");
	}

	void add();

}

interface X {
	void add();
}

class C implements Z, X {

	public void add() {
		System.out.println("add of z interface in c class");

	}

}
