package _17_stream_api;

import java.util.function.Consumer;

public class PrintlnMethodPass {
    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer.accept("sai");

        process("Kumar Bandigi", System.out::println);

    }

    private static void process(String in, Consumer<String> o) {
        o.accept(in);
    }
}
