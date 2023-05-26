package _8series;

/*
 * 
 * There are 3 types of variables in java.
 * local   instance   static
 * 
 * instance - inside the class,outside the method(blue color)
 * 
 * local - inside the class,inside the method or block of code(black color)
 * 
 * static or class variable - inside the class,outside the method(blue color with italic)
 * 
 * 
 * 
 * 
 */

public class VariablesInfo {

	final static int i = 2;

	// final int speedlimit = 90;// final variable

	void run() {

		int b=20;
		final int a = 100;
		System.out.println(i);
	}

	public static void main(String[] args) {
		VariablesInfo obj = new VariablesInfo();
		obj.run();

	}
}
