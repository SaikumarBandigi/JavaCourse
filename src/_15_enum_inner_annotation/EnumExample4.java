package _15_enum_inner_annotation;


/*
Constructor of enum type is private. If you don't declare private compiler internally creates private constructor.
 */
class EnumExample4 {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;

        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {

        for (Season s : Season.values())
            System.out.println(s + " " + s.value);

    }
}