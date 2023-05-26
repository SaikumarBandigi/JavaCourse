package _8series;

public class Practise3 {
	public static void main(String[] args) {

		Prashu s = new Prashu();
		s.show();
	}
}

class Kumar {

	public void show() {
		System.out.println("sai kumar");

	}

}

class Prashu extends Kumar {
	public void show() {
		System.out.println("Prashu");

	}
}