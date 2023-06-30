package _11_object_cloning;

import java.io.Serializable;

/*
since there is clone() method in Object class just take it.but, by extending a class to Object class
and creating an object and we can't call the clone() method which is in Object class since it is protected.
so, just override it as given below.

** error **
Cloning cloning1 = cloning.clone(); because clone() method gives object of Object to get particular do casting.
****

Cloning cloning1 = (Cloning) cloning.clone(); this works.


without implementing cloneable we get error.
implement your class to cloneable which means you are allowed to clone the object
cloneable interface is marker interface which is used generally for permissions

there are two types serializable and cloneable interface.


internally it is going as deep copying and looks like shallow copying.
 */
public class CloningObject {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cloning cloning = new Cloning();
        cloning.i = 5;
        cloning.j = 10;

        Cloning cloning1 = (Cloning) cloning.clone();

        System.out.println(cloning);
        System.out.println(cloning1);

    }
}

class Cloning implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "Cloning{" +
                "i=" + i +
                ", j=" + j +
                '}';

    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}