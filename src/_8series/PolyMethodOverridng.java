package _8series;

/*
 * when it is method overriding if child class has same method why it goes to parent class.
 * 
 * if not, it checks parent class method.
 * 
 */

// method overriding,late binding,dynamic binding,Runtime Polymorphism
public class PolyMethodOverridng {
	public static void main(String[] args) {

		J j = new J();
		j.show();

	}
}

class I {

	public void show() {
		System.out.println("SAI");
	}

}

class J extends I {

	public void show() {

		System.out.println("Kumar");
	}
}