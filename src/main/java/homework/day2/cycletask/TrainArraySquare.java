package main.java.homework.day2.cycletask;

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

    public void print() {
        for (int arrayMember : array) {
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }

    public void squareArray() {

        for (int arrayMember : array) {
            arrayMember = arrayMember * arrayMember;
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }
}
