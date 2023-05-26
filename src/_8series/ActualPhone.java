package _8series;

public class ActualPhone {
	public static void main(String[] args) {

		show(new Motorola());
		show(new Nokia());

	}

	public static void show(Phone obj) {

		obj.showConfig();

	}

}
