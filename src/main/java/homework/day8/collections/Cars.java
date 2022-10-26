package main.java.homework.day8.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        for (String car : cars) {
            out.write("\"" + car + "\"\n");
        }
        out.close();

        int i = 0;
        while (i < cars.size()) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
            } else i++;
        }

        for (String car : cars) {
            System.out.println(car + " ");
        }
    }
}
