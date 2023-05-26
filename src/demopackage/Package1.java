package demopackage;

import demopackagee.A;

/*

final
abstract

private
default
protected
public

* for classes public,final,abstract 
* private and protected cannot be used with class.if it is inner class we can use private with class.

* private: specific class
* default: specific package
* public : any class or package
* protected: subsiding class


 */

public class Package1 extends A {
	public static void main(String[] args) {

		Package1 obj = new Package1();
		obj.method2();

	}

}
