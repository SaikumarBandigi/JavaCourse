package spoorthi;

public class AbstractClassandinterface {
    public static void main(String[] args) {

    }
}

abstract class Sai {

    /* concrete Methods */
    private void A() {

    }

    void B() {

    }

    protected void C() {

    }

    public void D() {

    }


    /* abstract Methods */
    abstract void E();

    protected abstract void F();

    public abstract void G();


    /* Instance Variables */


    private int a;
    int b;
    protected int c;
    public int d;

    public static final int e = 0;

}

interface Sonu {

    /* concrete Methods */

    default void A() { //java 8 or above

    }

    static void B() { //java 8 or above

    }

    private void C() { //java 9 or above

    }

    /* abstract Methods */
    public abstract void D(); //(public abstract by implicit)

    // Instance variables

    public static final int a = 10; //(public static final by implicit)


}