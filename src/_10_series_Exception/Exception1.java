package _10_series_Exception;

/*

in try{} block if a line has error it executes until it then goes to catch block.

we can use one try with multiple catch blocks..
 */

public class Exception1 {
    public static void main(String[] args) {


        int i = 6;
        int j = 2;

        int k = 0;


        int a[] = new int[4];

        try {

            k = i / j;

            for (int c = 0; c <= 3; c++) {
                a[c] = c + 1;
            }
            for (int b : a)
                System.out.println(b);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println(k);


    }
}
