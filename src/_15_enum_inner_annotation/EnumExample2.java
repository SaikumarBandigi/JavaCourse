package _15_enum_inner_annotation;

/*
Let us see another example of Java enum where we are using value(), valueOf(), and ordinal() methods of Java enum.

ordinal() method returns position of CONSTANT

Note: Java compiler internally adds values(), valueOf() and ordinal() methods within the enum at compile time.
 It internally creates a static and final class for the enum.

 What is the purpose of the values() method in the enum?
The Java compiler internally adds the values() method when it creates an enum.
The values() method returns an array containing all the values of the enum.

What is the purpose of the valueOf() method in the enum?
The Java compiler internally adds the valueOf() method when it creates an enum.
The valueOf() method returns the value of given constant enum.

What is the purpose of the ordinal() method in the enum?
The Java compiler internally adds the ordinal() method when it creates an enum.
The ordinal() method returns the index of the enum value.
 */

public class EnumExample2 {
    // enum Season { WINTER, SPRING, SUMMER, FALL; }
    // or //
    // enum Season { WINTER, SPRING, SUMMER, FALL }
    // or //
    enum Season {WINTER, SPRING, SUMMER, FALL};

    public static void main(String[] args) {

        //Season[] season=Season.values();

        for (Season s : Season.values()) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(Season.valueOf("SUMMER"));
        System.out.println();
        System.out.println(Season.valueOf("WINTER").ordinal());
        System.out.println(Season.valueOf("SUMMER").ordinal());
        System.out.println(Season.valueOf("RAINY").ordinal());

    }
}