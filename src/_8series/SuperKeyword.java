package _8series;

/*
 * super keyword is used only in method overriding concept.
 * 
 * in java every class extends Object Class.
 *
 * Every Constructor will call super.
 * even if you call parameterized constructor along with it calls default constructor.
 * 
 * super() will call default constructor.
 * super(i) will call parameterized constructor.
 * 
 * 
 * super.i will call parent class' variable.
 * super.show(); will call parent class show() method.
 * 
 * 
 * Whenever you create the instance of subclass,an instance of parent class is created implicitly 
 which is referred by super reference variable.

Usage of Java super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.
 * 
 * 
 */

public class SuperKeyword {
	public static void main(String[] args) {

		L k = new L(2);

	}
}

class Z {

	public Z() {
		System.out.println("in const Z");
	}

	public Z(int i) {
		System.out.println("in const Z int");
	}
}

class X extends Z {
	public X() {

		System.out.println("in const X");
	}

	public X(int i) {

		System.out.println("in const X int");
	}
}

class K extends X {
	public K() {
		System.out.println("in const K");
	}

	public K(int i) {

		System.out.println("in const K int");
	}
}

class L extends K {
	public L() {
		System.out.println("in const L");
	}

	public L(int i) {
		super(i);
		System.out.println("in const L int");
	}
}