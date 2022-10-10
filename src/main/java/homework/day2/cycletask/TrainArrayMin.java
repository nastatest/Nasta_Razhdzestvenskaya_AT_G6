package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArrayMin {
    int[] array;

    public TrainArrayMin() {
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

    public void findMinValue() {

        int arrayMember = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < arrayMember) {
                arrayMember = array[i];
            }
        }
        System.out.println(arrayMember);
        System.out.println();
    }
}
