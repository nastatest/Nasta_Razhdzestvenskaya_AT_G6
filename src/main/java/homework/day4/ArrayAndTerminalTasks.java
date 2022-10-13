package main.java.homework.day4;

public class ArrayAndTerminalTasks {

    public void sumOfElements(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i <= array.length - 1; i += n) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
