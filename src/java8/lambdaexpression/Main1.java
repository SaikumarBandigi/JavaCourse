package java8.lambdaexpression;

public class Main1 {
    public static void main(String[] args) {

        Sai s = (a) -> {
            System.out.println("sai..");
            return a;
        };
        System.out.println(s.add(10));
    }
}

@FunctionalInterface
interface Sai {
    int add(int a);
}