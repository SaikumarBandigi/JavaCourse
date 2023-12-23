package java8.methodreference;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<Integer> consumer = integer -> {
            int res = integer * integer;
            System.out.println(res);
        };

        List<Integer> arrayList = List.of(1, 2, 3, 4, 5);

        arrayList.forEach(consumer);


    }
}
