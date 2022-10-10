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
    public void findMinValue() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

        int minValue;

        if (array[0] < array[1]) {
            minValue = array[0];
        }
        else {
            minValue = array[1];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
        System.out.println();
    }
}
