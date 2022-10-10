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

    public void print() {
        for (int arrayMember : array) {
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }

    public void multiplyArray() {
        for (int arrayMember : array) {
            arrayMember = arrayMember * 5;
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }
}