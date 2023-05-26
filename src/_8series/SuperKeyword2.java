package _8series;

public class SuperKeyword2 {
	public static void main(String[] args) {

		R r = new R();
		r.show();

	}
}

class E {
	int i = 5;
}

class R extends E {
	int i = 8;

	void show() {
		System.out.println(super.i); // (i); see the difference
	}
}