package practise_stream;

import java.util.ArrayList;

class Sai<T> {
    T i;

    public void show() {
        System.out.println(i.getClass().getName());
    }

    public void disc(ArrayList<? extends T> list) {
        System.out.println("disc method..");
    }

}

public class Main {
    public static void main(String[] args) {


        Sai<Number> s = new Sai();
        s.disc(new ArrayList<Integer>());

    }
}
