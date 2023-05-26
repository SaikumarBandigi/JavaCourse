package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List in Java provides the facility to maintain the ordered collection. 
 * It contains the index-based methods to insert, update, delete and search the elements. 
 * It can have the duplicate elements also. We can also store the null elements in the list.
 * 
 * 
 * 
 * 
The List interface is found in the java.util package and inherits the Collection interface.
It is a factory of ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions. The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector. The ArrayList and LinkedList are widely used in Java programming.
 The Vector class is deprecated since Java 5.

Java List vs ArrayList
List is an interface whereas ArrayList is the implementation class of List.

How to create List
The ArrayList and LinkedList classes provide the implementation of List interface. 
Let's see the examples to create the List:


//Creating a List of type String using ArrayList  
List<String> list=new ArrayList<String>();  
  
//Creating a List of type Integer using ArrayList  
List<Integer> list=new ArrayList<Integer>();  
  
//Creating a List of type Book using ArrayList  
List<Book> list=new ArrayList<Book>();  
  
//Creating a List of type String using LinkedList  
List<String> list=new LinkedList<String>();  



 */
public class ListInfo {
	public static void main(String[] args) {
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  
	}
}
