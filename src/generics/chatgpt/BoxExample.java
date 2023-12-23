package generics.chatgpt;


class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public Box(T value) {
        this.value = value;
    }

    public static void printBox(Box<?> box) {
        Object object = box.getValue();
        System.out.println(object);
    }

    public static <T> T getElement(T[] array, int index) {
        return array[index];
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

}

public class BoxExample {
    public static void main(String[] args) {

        //    Box<?> tBox = new Box<>("Hello, Wildcard!");

        Integer[] arr = {100, 101, 102, 103, 104, 105};
        Integer integer = Box.getElement(arr, 3);
        System.out.println(integer);

    }
}