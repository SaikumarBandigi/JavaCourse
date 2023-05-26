package jumpstatements;

/*
 * 
 * The continue statement is used in loop control structure when you need to jump to the next
 *  iteration of the loop immediately. 
 * It can be used with for loop or while loop.

The Java continue statement is used to continue the loop. 
It continues the current flow of the program and skips the remaining code at the specified condition. 
In case of an inner loop, it continues the inner loop only.

We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.
 * 
 */

//Java Program to demonstrate the use of continue statement  
//inside the for loop.  
public class ContinueExample {
	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip the rest statement
			}
			System.out.println(i);
		}
	}
}