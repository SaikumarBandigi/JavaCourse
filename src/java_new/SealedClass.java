package java_new;

/*
in general, if a class gets final then it can't be inherited by any other classes.to get permission for some classes we use sealed concept.

sealed class is used for giving permission to other classes which are only permitted.

if a class is made sealed with sealed keyword then it must permits the subclass.Then, which class gets permits that should be provided as sealed or non-sealed or
final.

 */
sealed class A permits B, C {
    void show() {
        System.out.println("sealed A");
    }
}

non-sealed class B extends A  {

}

final class C extends A {

}

 class D extends B {

}

public class SealedClass {
    public static void main(String[] args) {

        D d = new D();
        d.show();
    }
}
