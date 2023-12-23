package stringpack;

public class FormatExample3 {
    public static void main(String[] args) {


        String s1 = "Sonu";

        System.out.printf("%s\n", s1);
        System.out.printf("%s\n", 101);
        System.out.printf("|%d| \n", 101);
        System.out.printf("|% d| \n", 101);
        System.out.printf("|%10d| \n", 101);
        System.out.printf("|%-10d| \n", 101);
        System.out.printf("|%010d| \n", 101);



    }
}