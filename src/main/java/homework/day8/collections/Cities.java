package main.java.homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int lettersCount = 0;
        for (int i = 0; i < cities.size(); i++) {
            lettersCount += cities.get(i).length();
        }
        System.out.println(lettersCount);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
