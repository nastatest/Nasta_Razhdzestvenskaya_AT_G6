package cycletask;

import java.util.Random;

public class TrainArray {
    public void createArray() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(array.length);
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
