package _14_series_collection_generics;

import _9series.A;

import java.util.ArrayList;
class Sai<T extends Number> {
    T value;

    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? super T> values) {

    }}
public class Generics_Info {
    public static void main(String[] args) {

        Sai<Number> s = new Sai();
        s.value = 10;
        s.show();
        s.demo(new ArrayList<Number>());
    }}