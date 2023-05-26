package asbtraction;

import java.util.ArrayList;
import java.util.List;

public class InterfaceExample {
	public static void main(String[] args) {

		A a = new B();
		a.show();

	}
}

interface A {
	void show();
}

class B implements A {
	public void show() {
		System.out.println("sai");
	}

	public void display() {
		System.out.println("display");
	}

}
