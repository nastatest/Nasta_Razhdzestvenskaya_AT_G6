package main.java.homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        StringBuilder noodlesString = new StringBuilder();
        for (String noodle : noodles) {
            noodlesString.append(noodle).append(" - ");
        }
        String noodlesWithDash = noodlesString.toString();
        if (noodlesWithDash.length() > 1) {
            noodlesWithDash = noodlesWithDash.substring(0, noodlesWithDash.length() - 2);
        }
        System.out.println(noodlesWithDash);

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace('a', 'o'));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
