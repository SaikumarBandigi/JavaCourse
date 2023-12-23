package generics.chatgpt.genericinterface;

// Generic interface with a type parameter E
interface Pair<E> {
    E getFirst();
    E getSecond();
}

// Implementation of the generic interface
class OrderedPair<T> implements Pair<T> {
    private T first;
    private T second;

    public OrderedPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public T getSecond() {
        return second;
    }
}

// Example usage of the generic interface
public class GenericInterfaceExample {
    public static void main(String[] args) {
        // Creating an ordered pair of integers
        Pair<Integer> intPair = new OrderedPair<>(1, 2);
        System.out.println("First: " + intPair.getFirst() + ", Second: " + intPair.getSecond());

        // Creating an ordered pair of strings
        Pair<String> stringPair = new OrderedPair<>("Hello", "World");
        System.out.println("First: " + stringPair.getFirst() + ", Second: " + stringPair.getSecond());
    }
}
