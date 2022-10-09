package main.java.homework.day1.cycletask;

import java.util.Random;

public class TrainArraySquare {
    int[] array;

    public TrainArraySquare() {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    public void squareArray() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : array) {
            x = x * x;
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
