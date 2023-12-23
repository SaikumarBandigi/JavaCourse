package spoorthi.multithreading;

public class ThreadDemo99 implements Runnable {
    public static void main(String[] args) {

        ThreadDemo99 obj = new ThreadDemo99();
        Thread t1 = new Thread(obj);

        t1.start();

    }

    @Override
    public void run() {
        System.out.println("The Thread is created using runnable interface");
    }
}
