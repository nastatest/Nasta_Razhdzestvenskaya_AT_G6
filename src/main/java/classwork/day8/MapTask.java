package main.java.classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        String[] array = "мама мыла раму".split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int key : words.keySet()) {
            System.out.println(key);
        }

        for (String value : words.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> set : words.entrySet()) {
            System.out.println(set);
        }
    }
}
