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

        Sai sai = i -> System.out.println("sai from stream api..");
        sai.show(10);

    }
}
