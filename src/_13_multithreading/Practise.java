package _13_multithreading;

class College {
    int count;

    public synchronized void increment() {
        count++;
    }
}


public class Practise {
    public static void main(String[] args) throws InterruptedException {

        College c = new College();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
