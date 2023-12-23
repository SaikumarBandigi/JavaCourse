package java8.streamapi;

import java.util.List;

public class Mapping {
    public static void main(String[] args) {

        List<String> names = List.of("sai", "sonu");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
