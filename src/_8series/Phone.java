package _8series;

abstract class Phone {

	abstract void showConfig();

}

class Motorola extends Phone {

	void showConfig() {
		System.out.println("moto config");
	}

}

class Nokia extends Phone {
	void showConfig() {
		System.out.println("Nokia config");
	}
}