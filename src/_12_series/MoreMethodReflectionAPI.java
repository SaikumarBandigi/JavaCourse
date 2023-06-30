package _12_series;

interface Manish{

}


public class MoreMethodReflectionAPI {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c =Class.forName("_12_series.Manish");
        System.out.println(c.isInterface());

    }
}
