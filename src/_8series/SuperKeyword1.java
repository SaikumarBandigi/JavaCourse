package _8series;

public class SuperKeyword1 {
	public static void main(String[] args) {

		F f = new F();
		f.show();

		
	}
}

class S {
	void show() {
		System.out.println("S show");
	}
}

class F extends S {
	void show() {
		super.show();
		System.out.println("F show");
	}
}
