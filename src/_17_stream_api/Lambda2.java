package _17_stream_api;

interface Addable {
    int add(int a, int b);
}

public class Lambda2 {
    public static void main(String[] args) {

        Addable add = (a, b) -> {
            return a + b;
        };
        System.out.println(add.add(10, 20));
    }
}

