package _17_stream_api;

public class Hero implements Actor{
    @Override
    public void act() {
        System.out.println("hero acts");
    }

    @Override
    public void speak() {
        System.out.println("hero speaks");
    }

    public static void main(String[] args) {
        Hero hero= new Hero();
        hero.comedy();
    }
}
