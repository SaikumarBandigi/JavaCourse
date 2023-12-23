package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

//        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
//
//        concurrentMap.put("one", 1);
//        concurrentMap.put("two", 2);
//        concurrentMap.put("three", 3);
//
//        // Perform concurrent read and write operations
//        Runnable task1 = () -> {
//            String key = "two";
//            int value = concurrentMap.get(key);
//            System.out.println(Thread.currentThread().getName() + ": Value for key '" + key + "' is " + value);
//
//            String newKey = "four";
//            int newValue = 4;
//            concurrentMap.put(newKey, newValue);
//            System.out.println(Thread.currentThread().getName() + ": Added key-value pair: '" + newKey + "'=" + newValue);
//        };
//
//        // Create multiple threads to access the concurrent map
//        Thread thread1 = new Thread(task1, "Thread-1");
//        Thread thread2 = new Thread(task1, "Thread-2");
//
//        thread1.start();
//        thread1.join();
//        thread2.join();
//        thread2.start();
//
//        ///////////////////
//        System.out.println();
//        //////////////////////
//        // Create a non-thread-safe HashMap
//        Map<String, Integer> hashMap = new HashMap<>();
//
//        // Wrap the HashMap with a synchronized version
//        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);
//
//        // Perform concurrent read and write operations
//        Runnable task2 = () -> {
//            String key = "two";
//            int value = synchronizedMap.getOrDefault(key, 0);
//            System.out.println(Thread.currentThread().getName() + ": Value for key '" + key + "' is " + value);
//
//            String newKey = "four";
//            int newValue = 4;
//            synchronizedMap.put(newKey, newValue);
//            System.out.println(Thread.currentThread().getName() + ": Added key-value pair: '" + newKey + "'=" + newValue);
//        };
//
//        // Create multiple threads to access the synchronized map
//        Thread thread3 = new Thread(task2, "Thread-1");
//        Thread thread4 = new Thread(task2, "Thread-2");
//
//      thread3.start();
//      thread3.join();
//      thread4.join();
//      thread4.start();

        /////////////////


        HashMap<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);


        Runnable obj1 = () -> {
            String key = "one";
            int value = synchronizedMap.getOrDefault(key, 0);
            System.out.println(Thread.currentThread().getName() + ": Value for key '" + key + "' is " + value);


            String newKey = "two";
            int newValue = 2;
            synchronizedMap.put(newKey, newValue);
            System.out.println(Thread.currentThread().getName() + ": Added key-value pair: '" + newKey + "'=" + newValue);
        };

        Thread t3 = new Thread(obj1, "Thread-1");
        Thread t4 = new Thread(obj1, "Thread-2");

        t3.start();
        t3.join();
        t4.join();
        t4.start();
    }
}
