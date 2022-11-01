package main.java.homework.day10;

import java.util.ArrayList;
import java.util.List;

public class EvenInchesTask {

    public static void main(String[] args) {

        List<Integer> inches = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            inches.add(i);
        }

        double sumOfDoubles = inches.stream().filter(inch -> inch % 2 == 0)
                .peek(System.out::println).mapToDouble(inch -> inch * 2.54)
                .sum();

        System.out.println(sumOfDoubles + " см");
    }
}
