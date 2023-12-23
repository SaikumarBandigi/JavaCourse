package stringpack;

public class SplitExample {
    public static void main(String[] args) {
        String input = "Hello World Java Programming";

        String[] words = input.split("");
        for (String s : words) {
            System.out.println(s);
        }
    }
}
