package main.java.homework.day8.collections;

import main.java.homework.day8.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();
        sandMap.put(1, sandbox.get(0));
        sandMap.put(2, sandbox.get(1));
        sandMap.put(3, sandbox.get(2));
        sandMap.put(4, sandbox.get(3));

        for (int key : sandMap.keySet()) {
            System.out.println(key);
        }

        for (Sand value : sandMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Sand> set : sandMap.entrySet()) {
            System.out.println(set);
        }
    }
}
