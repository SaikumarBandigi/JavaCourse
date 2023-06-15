package stringconcept;

/*
Immutable String in Java
A String is an unavoidable type of variable while writing any application program.
String references are used to store various attributes like username, password, etc. In Java, String objects are immutable.
 Immutable simply means unmodifiable or unchangeable.

Once String object is created its data or state can't be changed but a new String object is created.

Let's try to understand the concept of immutability by the example given below:


Testimmutablestring.java

class Testimmutablestring{
 public static void main(String args[]){

   String s="Sachin";
   s.concat(" Tendulkar");//concat() method appends the string at the end
   System.out.println(s);//will print Sachin because strings are immutable objects

 }
}
Test it Now
Output:

Sachin

Now it can be understood by the diagram given below.
Here Sachin is not changed but a new object is created with Sachin Tendulkar. That is why String is known as immutable.

Immutable String in Java
As you can see in the above figure that two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar".

But if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.

For example:

Testimmutablestring1.java

class Testimmutablestring1{
 public static void main(String args[]){

   String s="Sachin";
   s=s.concat(" Tendulkar");
   System.out.println(s);

 }
}
Test it Now
Output:

Sachin Tendulkar

In such a case, s points to the "Sachin Tendulkar". Please notice that still Sachin object is not modified.

Why String class is Final in Java?
The reason behind the String class being final is because no one can override the methods of the String class.
So that it can provide the same features to the new String objects as well as to the old ones.

 */
public class StringInfoMore {
    public static void main(String[] args) {
        String s="Sachin";
        s=s.concat(" Tendulkar");
        System.out.println(s);
    }
}
