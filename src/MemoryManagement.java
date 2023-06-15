/*
int a=10; in java means a and value 10 both are stored in stack are heap memory?
_______________________________________________

In Java, the declaration "int a = 10;" creates a variable named "a" of type int and assigns it the value 10. The memory allocation for this variable depends on its scope.

For local variables like the one in your example, such as variables declared within a method or a block of code,
the memory for them is allocated on the stack. When the method or block of code ends, the memory allocated for the local variables is automatically released.

Therefore, in this case, the variable "a" and its value 10 are stored in the stack memory.

On the other hand, if the variable "a" was declared as an instance variable (a member variable) or a class variable (a static variable),
 it would be stored in the heap memory. Instance variables are associated with objects,
 and their memory allocation and deallocation are managed by the Java Virtual Machine (JVM).

To summarize:

For local variables, like the one in your example, the variable and its value are stored on the stack.
For instance variables and class variables, the variables themselves are stored in the heap memory along with the objects they are associated with.
 */

/*

explain full concepts of stack and heap memory management with examples in java?
-----------------------------------------------

In Java, memory management is handled by the Java Virtual Machine (JVM).
The JVM divides the memory into two main areas: the stack and the heap. Let's explore these memory areas and their management in more detail.

Stack Memory:
The stack memory is used for storing local variables and method calls. It operates in a last-in-first-out (LIFO) manner.
 Each thread in a Java program has its own stack memory.
Allocation and Deallocation: Memory allocation and deallocation on the stack are automatic and efficient.
 When a method is called, a new stack frame is created to store local variables and method parameters.
  When the method execution completes, the stack frame is removed, and the memory is automatically deallocated.

Example:

void methodA() {
  int x = 10;
  methodB();
}

void methodB() {
  int y = 20;
  // ...
}


In this example, when methodA() is called, a stack frame is created to store the variable x.
Then, when methodB() is called, another stack frame is created to store the variable y.
When methodB() completes, its stack frame is removed, and then methodA() continues its execution.

Heap Memory:
The heap memory is used for dynamic memory allocation and storing objects.
It operates in a more flexible manner than the stack memory. All objects and their instance variables reside in the heap.
Allocation and Deallocation: Objects are created using the new keyword, and the memory for them is allocated on the heap.
 The JVM manages the allocation and deallocation of heap memory through a process called garbage collection.
 Garbage collection automatically identifies objects that are no longer referenced and frees their memory.

Example:


class MyClass {
  private int value;

  public MyClass(int value) {
    this.value = value;
  }
}

MyClass obj1 = new MyClass(10);
MyClass obj2 = new MyClass(20);


In this example, two instances of the MyClass object are created using the new keyword, and their memory is allocated on the heap.
 The references obj1 and obj2 hold the memory addresses where the objects are located.

The stack memory contains the references obj1 and obj2, while the actual objects and their instance variables reside in the heap.

It's important to note that the stack memory is generally faster to access than the heap memory, but it has a limited size compared to the heap.
 Additionally, primitive data types like int, boolean, etc., can be stored directly on the stack if they are local variables, even if they are part of an object.

Proper understanding and management of stack and heap memory are crucial for efficient memory usage and avoiding memory-related issues such as
 stack overflow or memory leaks.
The JVM's garbage collector handles most of the memory management automatically,
 but it's important to write efficient and memory-conscious code to ensure optimal performance.
 */
public class MemoryManagement {
    public static void main(String[] args) {

    }
}
