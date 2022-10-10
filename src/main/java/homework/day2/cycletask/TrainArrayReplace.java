package main.java.homework.day2.cycletask;

import java.util.Random;

public class TrainArrayReplace {
    int[] array;

    public TrainArrayReplace() {
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

    public void replaceArrayMembers() {

        int firstMember = array[0];
        int lastMember = array[array.length - 1];

        array[0] = lastMember;
        array[array.length - 1] = firstMember;
    }
}
