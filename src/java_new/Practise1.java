package java_new;

interface Kunal {
    int add(int a, int b);
}

public class Practise1 implements Kunal {
    public static void main(String[] args) {

        Kunal practise1=new Practise1();
        System.out.println(practise1.add(1,4));

    }

    @Override
    public int add(int a, int b) {
        return (a+b);
    }
}