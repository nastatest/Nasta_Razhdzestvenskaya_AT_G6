package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArrayMultiply {
    int[] array;

    public TrainArrayMultiply() {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    public void multiplyArray() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : array) {
            x = x * 5;
            System.out.print(x + " ");
        }
        System.out.println();
    }
}