package _10_series_Exception;

/*
throws:
The "throws" keyword is used in a method declaration to indicate that the method might throw one or more exceptions.
 It specifies the type of exceptions that the method may generate, allowing the caller to handle those exceptions appropriately.
 */
public class TestThrows {
    //defining a method
    public static int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    //main method
    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}