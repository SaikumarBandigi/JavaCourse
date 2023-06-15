package _10_series_Exception;

import java.io.*;
import java.util.Scanner;

/*
The "try-with-resources" statement was introduced in Java 7 to simplify the handling of resources that need to be explicitly closed after use,
 such as file streams, database connections, network sockets, etc.
  It is a language feature that helps ensure proper resource management and reduce the risk of resource leaks and related bugs.

Before Java 7, developers had to manually close resources using the finally block, which could be error-prone and verbose.
The finally block required explicit handling of resource closing, and if not done properly, it could lead to resource leaks,
where resources were not released, causing potential issues like file locks, database connection pool exhaustion, or other resource-related problems.

The try-with-resources statement simplifies this process by automatically closing the resources at the end of the statement block,
regardless of whether an exception occurs or not. It ensures that the resources are closed properly, even if an exception is thrown,
 improving the reliability and maintainability of the code.

Here's an example of how try-with-resources is used to automatically close a file stream:

java
Copy code
 */
public class TryWithResources {
    public static void main(String[] args)   {


        File file = new File("C:\\Users\\bandi\\OneDrive\\Documents\\PrintWriter\\pgAdmin.txt");


        try (PrintWriter writer = new PrintWriter(file)) {

            int i = 5;

            writer.println(i);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
