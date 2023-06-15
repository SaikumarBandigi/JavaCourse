package _17_stream_api;

import java.util.Arrays;
import java.util.List;

public class Java8InternalIteration {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        values.forEach(Java8InternalIteration::doubleit);
    }

    static void doubleit(int i) {
        System.out.println(i * 2);
    }
}
