package main.java.classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String[] parts = "мама мыла раму".split(" ");

        for (String i : parts) {
            mySet.add(i);
        }

        Iterator<String> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String j : mySet) {
            System.out.println(j);
        }
    }
}
