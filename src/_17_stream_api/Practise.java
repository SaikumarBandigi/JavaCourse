package _17_stream_api;

import java.util.*;

interface Ratna {
    String cook(String name);
}


public class Practise {
    public static void main(String[] args) {


        Ratna ratna = (name)-> {
            return "cooks";
        };
        System.out.println(ratna.cook("Biryani"));
    }
}
