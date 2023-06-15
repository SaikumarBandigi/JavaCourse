package _10_series_Exception;

public class TestThrowAndThrows
{
    // defining a user-defined method
    // which throws ArithmeticException
    static void method()
    {
        System.out.println("Inside the method()");
        throw new ArithmeticException("throwing ArithmeticException");
    }
    //main method
    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch(Exception e)
        {
            System.out.println("caught in main() method");
        }
    }
}