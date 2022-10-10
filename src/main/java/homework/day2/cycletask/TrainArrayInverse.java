package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArrayInverse {
    int[] array;
    public TrainArrayInverse() {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    public void printArrayInverse() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
