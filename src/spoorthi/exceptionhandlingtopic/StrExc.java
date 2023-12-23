package spoorthi.exceptionhandlingtopic;

public class StrExc {
    public static void main(String[] args) {

        //   Scanner sc = new Scanner(System.in);
        String s = "Ind";

        try {

            if (s.equalsIgnoreCase("India")) {
                System.out.println("String is matched");
            } else {
                throw new Sai("No Match Exception");
            }

        } catch (Sai sai) {
        }

    }
}

class Sai extends Exception {

    public Sai(String s) {
        //  super(s);
        System.out.println(s);
    }
}