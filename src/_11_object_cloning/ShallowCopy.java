package _11_object_cloning;

/*
in shallow copy we have one object and two references.
so, if we make a change from any reference it will change the object value i.e for both.


 */
public class ShallowCopy {
    public static void main(String[] args) {

        Shallow shallow = new Shallow();
        shallow.i = 5;
        shallow.j = 10;

        Shallow shallow1 = shallow;
        shallow1.i = 20;
        shallow1.j = 30;

        System.out.println(shallow);
        System.out.println(shallow1);

    }
}

class Shallow {
    int i;
    int j;

    @Override
    public String toString() {
        return "Shallow{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
