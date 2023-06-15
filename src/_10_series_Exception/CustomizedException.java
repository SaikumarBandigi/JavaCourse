package _10_series_Exception;

public class CustomizedException {
    public static void main(String[] args) {


        try {
            throw new A("sai");
        } catch (A e) {
            System.out.println(e);
        }

    }
}

class A extends Exception {
    public A(String msg) {
        super(msg);
    }

}


// 6302968665 - srikanth sir