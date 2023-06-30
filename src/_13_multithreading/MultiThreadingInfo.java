package _13_multithreading;

import java.util.Arrays;

/*
There are two way to create thread by extending Thread or Implementing Runnable
because if it is simple class then extend Thread class or if that class has to extend another classes then wants to get Thread then implement Runnable
Runnable interface has run() method using which we can achieve properties of Thread class.

parallely if you want new thread make it start() method. and start() method automatically calls run() method.
if you call run() it will not create new thread.

start() method automatically calls run() method.

 */
public class MultiThreadingInfo extends Thread  {
    public static void main(String[] args) {

        Thread t1=new MultiThreadingInfo();
        t1.start();

    }

    public void run() {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        System.out.println(Arrays.toString(a));
    }
}

