package java_new;

public class SwicthInfo {
    public static void main(String[] args) {

        int i = 10;

        String s = "Sunday";

        String result = "";

//        switch (i) {
//            case 1 -> System.out.println("1");
//            case 2 -> System.out.println("2");
//            case 3 -> System.out.println("3");
//            case 4 -> System.out.println("4");
//
//            default -> System.out.println("10");


        /************************/

//        switch (s) {
//
//            case "Saturday", "Sunday":
//                System.out.println("8 AM");
//                break;
//
//            case "Tuesday":
//                System.out.println("7 AM");
//
//            default:
//                System.out.println("6 AM");
//
//        }


        /******************   enhanced switch statement **********/


//        switch (s){
//            case "Sunday","Saturday" -> System.out.println("8 AM");
//            default -> System.out.println("6 AM");
//        }



        /* switch expression */

        switch (s) {
            case "Monday" -> result = "7 AM";
            case "Tuesday" -> result = "8 AM";
            case "Sunday" -> result = "9 AM";
            default -> result = "6 AM";
        }

        System.out.println(result);


        /***/
//        result = switch (s) {
//            case "Sunday" -> "8 AM";
//            case "Monday" -> "7 AM";
//            default -> "6 AM";
//        };
//
//        System.out.println(result);

    }
}
