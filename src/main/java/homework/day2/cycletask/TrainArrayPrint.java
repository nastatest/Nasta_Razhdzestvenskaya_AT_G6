package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArrayPrint {
    int[] array;
    public TrainArrayPrint() {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
