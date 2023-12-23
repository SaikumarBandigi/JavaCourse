package spoorthi.multithreading;

public class MainThread98 {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        System.out.println(t1);

        t1.setName("Sai Thread");
        System.out.println(t1);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread got interrupted");
        }

    }
}
