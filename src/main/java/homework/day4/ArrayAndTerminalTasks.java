package main.java.homework.day4;

public class ArrayAndTerminalTasks {

    public void print(int[] array) {
        for (int arrayMember : array) {
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }

    public void sumOfElements(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i <= array.length - 1; i += n) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public int[] inverseArray(int[] array, int n) {
        int[] newArray = new int[] {};
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                for (int newArrayIndex = 0; ; newArrayIndex++) {
                    newArray = array[i];
                }
            }
        }
        return newArray;
        //for (int arrayMember : newArray) {
        //    System.out.print(arrayMember + " ");
        //}
        //System.out.println();
    }
}
