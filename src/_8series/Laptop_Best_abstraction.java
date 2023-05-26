package _8series;

public class Laptop_Best_abstraction {
	public static void main(String[] args) {

		show(new Dell());
		show(new HP());

	}

	public static void show(lap l) {
		l.code();

	}

}

abstract class lap {
	abstract void code();
}

class Dell extends lap {

	void code() {
		System.out.println("dell code");
	}

	void meet() {

	}
}

class HP extends lap {

	void code() {
		System.out.println("HP code");
	}
}
