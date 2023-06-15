package _17_stream_api;

interface Prashu {
    String show();
}

public class Lambda1 {
    public static void main(String[] args) {

        Prashu p = () -> {
            return "sai";
        };
        System.out.println(p.show());
    }
}
