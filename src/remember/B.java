package remember;

class A {
    void add1() {
        System.out.println("add1 from A");
    }

    void add2() {
        System.out.println("add2 from A");
    }

    void add3() {
        System.out.println("add3 from A");
    }


}

public class B extends A {
    public static void main(String[] args) {

        A obj = new B();
        obj.add1();
        obj.add2();
        obj.add3();
       // obj.extraMethod();


    }

   // @Override
    public void add1() {
        System.out.println("add1 from B");
    }

   // @Override
    public void add2() {
        System.out.println("add2 from B");
    }

   // @Override
    public void add3() {
        System.out.println("add3 from B");
    }

    public void extraMethod() {
        System.out.println("extra method from B");
    }

}