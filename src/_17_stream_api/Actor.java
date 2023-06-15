package _17_stream_api;

public interface Actor {
    void act();

    void speak();

    default void comedy() {
        System.out.println("Actor Comedy");
    }

}
