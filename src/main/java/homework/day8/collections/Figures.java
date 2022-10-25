package main.java.homework.day8.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));

        for (String figure : figures) {
            out.write(figure + "-");
        }
        out.close();

        int iCount = 0;
        for (int i = 0; i < figures.size(); i++) {
            if (!figures.get(i).contains("и")) {
                iCount++;
            }
        }

        System.out.println(iCount);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();

        figures.add(3, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
