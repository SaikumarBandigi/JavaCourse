package set;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        List<Integer> values = new Vector<>();
        values.add(11);
        values.add(4);
        values.add(2);
        values.add(5);

        for (Integer i : values) {
            System.out.println(i);
        }

    }
}
