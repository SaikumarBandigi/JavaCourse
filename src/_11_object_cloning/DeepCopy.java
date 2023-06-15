package _11_object_cloning;

/*

here, we create two objects and manually creating the old values to the new object variables.

 */

import method_Overriding.D;

public class DeepCopy {
    public static void main(String[] args) {

        Deep deep = new Deep();
        deep.i = 5;
        deep.j = 10;

        Deep deep1 = new Deep();
        deep1.i = deep.i;
        deep1.j = deep.j;

        System.out.println(deep);
        System.out.println(deep1);

    }
}

class Deep {
    int i;
    int j;

    @Override
    public String toString() {
        return "Deep{" + "i=" + i + ", j=" + j + '}';
    }
}