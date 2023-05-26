package _8series;

public class Anonymous_Object1 {
	public static void main(String[] args) {

		new Sai().k = 99;

		new Sai().show();

	}
}

class Sai {
	int k;

	void show() {
		System.out.println(k);
	}

}
