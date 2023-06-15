
package _10_series_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.DateTimeException;

/*

Throwable is a higher class then Exception then subs..

Throwable
- Exception
- checked Exception
   IOException
   SQlException

- Unchecked Exception (Runtime)
  Arithmetic Exception extends RuntimeException extends Exception extends Throwable
  ArrayIndexOutOfBoundsException

whenever you write statements inside a block of code make sure your declaration will assign value,
 because there are chances that written statement might not be executed


 */
public class ExceptionInfo {
    public static void main(String[] args) {


        int i = 6;
        int j = 0;

        int k = 0;
try {
    k = i / j;
}
catch (Exception e)
{
    System.out.println("sia");
}
        System.out.println(k);


    }
}
