package spoorthi.exceptionhandlingtopic;

public class UserDefinedExample95 {

    static void calculate(int i) throws MyException {

        System.out.println("Calculate" + i);
        if (i > 20) {
            throw new MyException(i);
        }
        System.out.println("Terminate");
    }

    public static void main(String[] args) {

        try {
            calculate(10);
            calculate(35);
        } catch (MyException ex) {
            System.out.println("An exception" + ex + "caught");
        }
    }
}

class MyException extends Exception {

    int x;

    MyException(int i) {
        x = i;
    }

    public String toString() {
        return "MyException" + x + " ";
    }

}