package main.java.classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashAndTreeSetTask {
    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            myList1.add("bugaga");
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int j = 0; j < 1000000; j++) {
            myList2.add("bugaga");
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        Iterator<String> iterator1 = myList1.iterator();

        while (iterator1.hasNext()) {
            iterator1.next();
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        Iterator<String> iterator2 = myList2.iterator();

        while (iterator2.hasNext()) {
            iterator2.next();
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
