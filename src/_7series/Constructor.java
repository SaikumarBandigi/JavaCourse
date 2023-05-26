package _7series;

public class Constructor

{
	/*
	 * even if you don't mention constructor it will be there by default thats why
	 * it is called as default constructor
	 *
	 * 
	 * 
	 * every time you create an object it will communicate with jvm , how much space
	 * is required that will be given by constructor. it is used to allocate the
	 * memory to the object
	 *
	 * Constructor name should be same as class name. Here,just for name sake i have
	 * provided class name as Constructor.
	 * 
	 * Constructor c = new Constructor();
	 * 
	 */

	int i;
	float f;

	public Constructor() {
		i = 5;
		f = 9.02f;

		System.out.println("hai");
	}

	public Constructor(int a) {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		Constructor c = new Constructor();
		Constructor c1 = new Constructor(501);

	}
}
