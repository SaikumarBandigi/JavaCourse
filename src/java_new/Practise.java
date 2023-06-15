package java_new;

public class Practise {
    public static void main(String[] args) {
        int i = 111;
        String result = "";
        result = switch (i) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            default -> "10";
        };
        System.out.println(result);
    }
}
