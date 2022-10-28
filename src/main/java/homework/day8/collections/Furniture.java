package main.java.homework.day8.collections;

import main.java.homework.day8.objects.Chair;

import java.util.*;

public class Furniture {

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(new Chair(1, 2),
                new Chair(4, 2), new Chair(2, 4));

        for (Chair chair : furniture) {
            int product = chair.getHeight() * chair.getWidth();
            System.out.print(product + " ");
        }
        System.out.println();

        Map<Integer, Chair> furnitureMap = new HashMap<>();
        furnitureMap.put(1, furniture.get(0));
        furnitureMap.put(2, furniture.get(1));
        furnitureMap.put(3, furniture.get(2));

        for (int key : furnitureMap.keySet()) {
            System.out.println(key);
        }

        for (Chair value : furnitureMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Chair> set : furnitureMap.entrySet()) {
            System.out.println(set);
        }
    }
}
