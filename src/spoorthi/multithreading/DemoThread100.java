package spoorthi.multithreading;

public class DemoThread100 extends Thread {
    public void run() {
        System.out.println("The Thread is created by extending thread class");
    }

    public static void main(String[] args) {

        DemoThread100 th1=new DemoThread100();
        th1.start();

    }
}
