package excephandl;

public class Main {
    public static void main(String[] args) {

        try {
            exampleMethod(2);
        } catch (CustomEx customEx) {
            customEx.printStackTrace();
        }
    }

    static void exampleMethod(int number) {

        if (number < 3) {
            throw new CustomEx("sorryy..");
        } else {
            System.out.println("number is " + number);
        }
    }

}

class CustomEx extends RuntimeException {
    public CustomEx(String s) {
        super(s);
    }
}