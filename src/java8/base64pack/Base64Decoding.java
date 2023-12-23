package java8.base64pack;

import java.util.Base64;

public class Base64Decoding {
    public static void main(String[] args) {

        String s = "c2FpIGt1bWFy";
        byte[] bytes = Base64.getDecoder().decode(s);


        String s1 = new String(bytes);
        System.out.println(s1);

    }
}
