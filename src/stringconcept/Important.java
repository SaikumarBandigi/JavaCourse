package stringconcept;

/*

1)equlas-> checks whether given input characters or given array of characters are same or not irrespective of memory address.

2) checks address is same or not

 */
public class Important {
    public static void main(String[] args) {
        String s1 = "sai";
        String s2 = "sai";

        String s7 = s1;

        String s6 = "sonu";

        String s3 = new String("sonu");
        String s4 = new String("sonu");

        String s8 = s4;

        String s5 = new String("sai");


        char a = 'A';
        int i = 65;

//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//
//        System.out.println(s3.equals(s4));
//        System.out.println(s3 == s4);

        //System.out.println(s6.equals(s3));

//        System.out.println(s7.equals(s2));
//        System.out.println(s7 == s2);

//        System.out.println(s8.equals(s4));
//        System.out.println(s8 == s4);

//        System.out.println(s8.equals(s6));
//
//        System.out.println(s8 == s6);


        // System.out.println('{' == 123);

        //      System.out.println(a == i);


    }
}
