public class PrimeExample {
    public static void main(String args[]) {


        int num = 5;
        int c = 2;
        boolean flag = false;


        while (c * c <= num) {
            if (num % c == 0) {
                flag = true;
                break;
            } else {
                c = c + 1;
            }
        }

        if (!flag) // if(!flag) same as (flag==false)
            System.out.println("prime");
        else
            System.out.println("not a prime");


    }
}