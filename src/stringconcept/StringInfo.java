package stringconcept;

import java.util.Arrays;

/*
In Java, string is basically an object that represents sequence of char values.
An array of characters works same as Java string. For example:

char[] ch={'j','a','v','a','t','p','o','i','n','t'};
String s=new String(ch);

is same as:

String s="javatpoint";
 */

/*
What is String in Java?
Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters.
The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

By string literal
By new keyword
1) String Literal
Java String literal is created by using double quotes. For Example:

String s="welcome";
Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool,
a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
For example:

String s1="Welcome";
String s2="Welcome";//It doesn't create a new instance

Java String
In the above example, only one object will be created. Firstly,
JVM will not find any string object with the value "Welcome" in string constant pool that is why it will create a new object.
 After that it will find the string with the value "Welcome" in the pool,
 it will not create a new object but will return the reference to the same instance.

Note: String objects are stored in a special memory area known as the "string constant pool".
Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

2) By new keyword
String s=new String("Welcome");//creates two objects and one reference variable
In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed
in the string constant pool. The variable s will refer to the object in a heap (non-pool).

Java String Example
StringExample.java

public class StringExample{
public static void main(String args[]){
String s1="java";//creating string by Java string literal
char ch[]={'s','t','r','i','n','g','s'};
String s2=new String(ch);//converting char array to string
String s3=new String("example");//creating Java string by new keyword
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}}
Test it Now
Output:

java
strings
example
The above code, converts a char array into a String object. And displays the String objects s1, s2, and s3 on console using println() method.
 */
public class StringInfo {

    public static void main(String[] args) {


        char ch[] = {'s', 'o', 'n', 'u'};

        String s1 = "sai";

        String s = new String(ch);
        int i = s.length();

        System.out.println(s);
        System.out.println(i);

//        String s1 = "Hello";
//        //String s2 = "Hello";
//        String s3 = new String("Hello");
//        s3 = s3.intern();
//
//        System.out.println(s1 == s3);// true
/*  we know that the intern() method will return the String Object reference from the string pool.
 since we assign it back to S2 and now both s1 and s2 are having the same reference. It means that s1 and s2 references point to the same object.
*/

    }
}
