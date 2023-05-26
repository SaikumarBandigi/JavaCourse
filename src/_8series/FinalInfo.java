package _8series;

/*
 * final keyword is used with variable,method and class
 * 
 * stop value change
 * stop method overriding
 * stop inheritance
 * 
 * if a variable is declared as final the value is fixed and can't be changed.
 * but if the variable is declared with final and initialized later it is acceptable and can't assign again.
 *  
 *  
 * methods declared with final keyword cannot be overriden.
 * 
 * if a class is declared as final then no other class can extend or inherit this particular class.
 * 
 */

public class FinalInfo {
	public static void main(String[] args) {

//		int i;
//		i = 10;
//		i = 7;
//		System.out.println(i);

		final int i = 8;
		// i++; we get error here
		System.out.println(i);

	}
}
