package stringconcept;

/*
What is String in Java?
Generally, String is a sequence of characters.
But in Java, string is an object that represents a sequence of characters.
 The java.lang.String class is used to create a string object.
 */

public class StringExample {
    public static void main(String args[]) {
        String s1 = "java";//creating string by Java string literal
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char array to string
        String s3 = new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}