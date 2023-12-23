package java8.optionalclass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("sai1");
        System.out.println(optional.get());


        Optional<String> optional1 = Optional.ofNullable(null);
        String s2 = optional1.orElse("sai2");
        System.out.println(s2);


        Optional<String> optional2 = Optional.empty();
        String s3 = optional2.orElseGet(() -> "sai3");
        System.out.println(s3);

    }
}
