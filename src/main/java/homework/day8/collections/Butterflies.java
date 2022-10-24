package main.java.homework.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\" ");
        }
        System.out.println();

        int oCount = 0;
        for (int i = 0; i < butterflies.size(); i++) {
            if (butterflies.get(i).contains("o")) {
                oCount++;
            }
        }
        System.out.println(oCount);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
        System.out.println();
    }
}