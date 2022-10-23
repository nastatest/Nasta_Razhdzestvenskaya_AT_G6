package main.java.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListTask {
    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

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

        for (int k = 0; k < myList1.size(); k++) {
            myList1.get(k);
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int m = 0; m < myList2.size(); m++) {
            myList2.get(m);
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
