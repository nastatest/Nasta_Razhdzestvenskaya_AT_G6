package main.java.classwork.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTask {

    private static int sumOfValues = 0;

    public static void main(String[] args) {

        Map<Integer, Integer> intMap = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                intMap.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                intMap.forEach((k, v) -> sumOfValues += v);
            }
        });

        t1.start();
        t2.start();
    }
}
