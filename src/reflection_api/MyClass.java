package reflection_api;

/*

what is necessary of reflection api and examples

The Reflection API is necessary in certain scenarios where you need to obtain information about classes, interfaces, methods, and fields at runtime,
 or when you want to dynamically load classes or invoke methods without knowing their names at compile time. Here are some examples of when
 and why you might use the Reflection API:

Plugin Systems: Suppose you are building an application that supports plugins. With the Reflection API,
you can dynamically load and instantiate plugin classes, even if they are not known at compile time. This allows your application to be more
extensible and easily accommodate new functionality through plugins.

Dependency Injection: In frameworks that use dependency injection, reflection can be used to automatically discover and inject dependencies
into classes, based on annotations or other metadata.

Serialization and Deserialization: When dealing with data interchange formats like JSON or XML, the Reflection API can be used to automatically
 convert between objects and their serialized representations, mapping fields to keys and vice versa.

Testing and Mocking: In unit testing, reflection can be helpful to access private fields or invoke private methods for the purpose of testing.
Similarly, mocking libraries often utilize reflection to create mock objects.

Database Mapping: Object-Relational Mapping (ORM) frameworks use reflection to map database tables to Java classes and vice versa,
 allowing seamless interaction between objects and the underlying database.

Annotation Processing: Reflection is often used in combination with annotations to process classes or methods marked with specific annotations,
allowing for custom behavior based on these annotations.

Example 1: Dynamic Loading of Classes
Example 2: Accessing and Invoking Methods with Reflection

 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        // Getting the class object
        Class<?> myClass = Class.forName("reflection_api.Sai");

        // Creating an instance of the class
        Sai myObject =(Sai) myClass.getDeclaredConstructor().newInstance();

        // Getting the method "myMethod" and invoking it
        Method myMethod = myClass.getDeclaredMethod("saveMethod",null);
        myMethod.setAccessible(true);
        myMethod.invoke(myObject);

        // Accessing and modifying a field
        Field myField = myClass.getDeclaredField("sal");
        myField.setAccessible(true);
      //  myField.set(myObject, "New Value");

        System.out.println(myField.get(myObject));
    }
}

class Sai {
    private static final int sal = 500;

    private void saveMethod() {
        System.out.println("sai kumar bandigi..");
    }

}