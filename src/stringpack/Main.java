package stringpack;

public class Main {
    public static void main(String[] args) {

        String str = "Welcome to Javatpoint portal";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                count++;
            }
        }

        System.out.println(count);
    }
}
