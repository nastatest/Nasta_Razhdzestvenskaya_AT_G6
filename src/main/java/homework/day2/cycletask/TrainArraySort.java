package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArraySort {
    int[] array;

    public TrainArraySort() {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    public void print() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void replace(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void sortArray() {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int x = 0; x < i; x++) {
                if (array[x] < array[x + 1]) {
                    replace( x, x + 1);
                }
            }
        }
    }
}