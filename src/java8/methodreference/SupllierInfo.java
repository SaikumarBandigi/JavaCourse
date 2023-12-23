package java8.methodreference;

import java.util.Random;
import java.util.function.Supplier;

public class SupllierInfo {
    public static void main(String[] args) {

        // Define a Supplier that generates a random integer
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);

        // Use the Supplier to get a random integer
        int randomNumber = randomIntegerSupplier.get();

        System.out.println("Random Number: " + randomNumber);
    }
}
