package java8.functionalinterface;

public class Main {
    public static void main(String[] args) {

        Mouse m = () -> 1;
        System.out.println(m.move());


    }
}

@FunctionalInterface
interface Mouse {
    int move();

    static void add() {
        System.out.println("private static Mouse");
    }

    private void sub() {
        System.out.println("Mouse private sub");
    }

    default void multi() {
        System.out.println("default Mouse multi");
    }

}