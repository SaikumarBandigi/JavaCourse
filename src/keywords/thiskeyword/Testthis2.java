package keywords.thiskeyword;



/*
 * 2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. If you don't use the this keyword,
 compiler automatically adds this keyword while invoking the method. Let's see the example
 */



/*

class A{
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
//m();//same as this.m()  
		this.m();
	}
}

public class Testthis2 {
	public static void main(String args[]) {
		A a = new A();
		a.n();
	}
}

*/

//////////////////////

/*
3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor.
 It is used to reuse the constructor. In other words, it is used for constructor chaining.

Calling default constructor from parameterized constructor:

class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
}}  
 */





///////////////////////////





/*
 Calling parameterized constructor from default constructor:

class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
System.out.println(x);  
}  
}  
class TestThis6{  
public static void main(String args[]){  
A a=new A();  
}}  

*/