package _8series;

/*
 * 
 * it doesnt matter which class  your reference is,what matters is the instance is the object.
 * 
 * your deciding which method to call at runtime.
 * 
 * 
 */
public class DynamicMethodDispatch {
	public static void main(String[] args) {

		Y y = new Y();
		y.show();

	}
}

class T {

	public void show() {
		System.out.println("in show T");
	}

}

class Y extends T {

	public void show() {

		System.out.println("in show Y");
	}

}