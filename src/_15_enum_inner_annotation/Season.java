package _15_enum_inner_annotation;
/*

Java Enum Example: main method inside Enum
If you put main() method inside the enum, you can run the enum directly.

 */
enum Season {
    WINTER, SPRING, SUMMER, FALL;
    public static void main(String[] args) {
        Season s=Season.WINTER;
        System.out.println(s);
    }
}