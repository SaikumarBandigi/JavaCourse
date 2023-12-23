package java8.base64pack;

import java.util.Base64;

public class Base64Encoding {
    public static void main(String[] args) {

        String s = "sai kumar";
        byte[] bytes = Base64.getEncoder().encode(s.getBytes());

        String s1 = new String(bytes);
        System.out.println(s1);
//c2FpIGt1bWFy
    }
}
