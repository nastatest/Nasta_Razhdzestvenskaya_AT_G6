package main.java.homework.day4;

import java.util.ArrayList;

public class ArrayAndTerminalTasks {

    public void print(int[] array) {
        for (int arrayMember : array) {
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }

    public void sumOfElements(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public int[] inverseArray(int[] array, int n) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                tempArray.add(array[i]);
            }
        }
        int[] newArray = new int[tempArray.size()];
        for (int x = 0; x < tempArray.size(); x++) {
            newArray[x] = tempArray.get(x);
        }
        return newArray;
    }
}
