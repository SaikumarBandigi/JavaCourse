package excephandl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example {
    // Create a logger instance using SLF4J
    private static final Logger logger = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Log an error message and print the stack trace
            logger.error("An exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // A method that may throw an exception
    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
