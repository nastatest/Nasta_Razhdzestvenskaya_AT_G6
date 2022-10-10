package main.java.classwork.day2;

import java.util.Random;

public class ThirdClass {

    public void fooo() {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        int av = sum / array.length;
        System.out.println("Average value is: " + av);
        }

}
