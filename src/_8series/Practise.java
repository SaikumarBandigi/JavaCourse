package _8series;

public class Practise {
	public static void main(String[] args) {

		M m = new M();
		m.show();

	}
}

class N {
	public void show() {
		System.out.println("in const N");
	}

}

class M extends N {

	public void show() {
		super.show();
		System.out.println("in const M");
	}

}