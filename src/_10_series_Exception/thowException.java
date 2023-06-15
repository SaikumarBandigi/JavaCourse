package _10_series_Exception;

public class thowException {
    public static void main(String[] args) throws ArithmeticException
    {


        try {

            int i = 1;
            System.out.println(i);
            throw new Exception();

        } catch (ArithmeticException e) {
            System.out.println(":sai"
            );
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
