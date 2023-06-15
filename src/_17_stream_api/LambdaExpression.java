package _17_stream_api;


interface Sai {
    void show(int i);

//    default void disc()
//    {
//        System.out.println("Ratna");
//    }

//    static void draw()
//    {
//        System.out.println("static interface");
//    }


}

public class LambdaExpression {
    public static void main(String[] args) {

        Sai s = i-> {
            System.out.println("Prashu");
        };
        s.show(10);
    }
}
