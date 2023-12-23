package spoorthi.multithreading;

public class SynchronizationEx106 {
    public static void main(String[] args) {

        First f = new First();
        Second s1 = new Second(f, "SIA");
        Second s2 = new Second(f, "GROUP");
        Second s3 = new Second(f, "COMPANY");

        try {
            s1.t.join();
            s2.t.join();
            s3.t.join();
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }

    }
}

class First {
    synchronized void call(String str) {
        System.out.println("[ " + str);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }
        System.out.println(" ]");
    }
}

class Second implements Runnable {

    String str;
    First f;
    Thread t;

    public Second(First fir, String s) {
        f = fir;
        str = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        f.call(str);
    }
}

