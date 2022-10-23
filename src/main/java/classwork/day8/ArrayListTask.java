package main.java.classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {
    public static void main (String[] args) {

        List<String> myList = new ArrayList<>();

        String[] parts = "мама мыла раму".split(" ");

        for (int i = 0; i < parts.length; i++) {
            myList.add(parts[i]);
            System.out.println(myList.get(i));
        }

        System.out.println();

        for (String count : parts) {
            myList.add(count);
            System.out.println(count);
        }
    }
}
