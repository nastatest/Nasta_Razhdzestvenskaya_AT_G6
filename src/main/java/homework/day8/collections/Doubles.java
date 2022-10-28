package main.java.homework.day8.collections;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double doubleNum : doubles) {
            System.out.print(doubleNum + " ");
        }
        System.out.println();

        double product = 1;
        for (double doubleNum : doubles) {
            product *= doubleNum;
        }
        System.out.println(product);

        double sumOfFractionalPart = 0;
        for (double doubleNum : doubles) {
            double temp = floor(doubleNum);
            double fractionPart = doubleNum - temp;
            sumOfFractionalPart += fractionPart;
        }
        System.out.printf("%f", sumOfFractionalPart);
        System.out.println();

        for (int i = 0; i < doubles.size(); i++) {
            int integerPart = (int) floor(doubles.get(i));
            System.out.print(integerPart + " ");
        }
    }
}
