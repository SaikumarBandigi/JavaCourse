package generics.chatgpt.genericclass;

// 1. Generic Class:

public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Usage
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(42);
        Integer intValue = integerBox.getValue();
        System.out.println(intValue);

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        String stringValue = stringBox.getValue();
        System.out.println(stringValue);
    }

}


/*
1. '<T>': This is a type parameter declaration, indicating that the method is generic and can work with any type.
 The <T> is a placeholder for the actual type that will be provided when the method is called.
 It allows you to create a method that can work with different types without having to specify the type at the time of method declaration.

2. 'T': The type parameter <T> is used as the return type of the method. This means that the method will return an object of the
 same type as the elements in the array.

3. 'getElement': This is the name of the method.

4. '(T[] array, int index)': These are the method parameters. The method takes two parameters:
'array': An array of type T.
'index': An integer representing the index of the element to be retrieved from the array.

5. 'return array[index];': The method returns the element at the specified index in the array.
The type of the returned element is the same as the type of elements in the array (denoted by T).

 */


