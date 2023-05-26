package _8series;

public class Functional_Interface {
	public static void main(String[] args) {

		AA obj = () -> System.out.println("AA SHOW");
		obj.show();
	}

}

interface AA {
	void show();
}
