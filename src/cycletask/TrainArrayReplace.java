package cycletask;

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

    public void replaceArrayMembers() {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

        int firstMember = array[0];
        int lastMember = array[array.length-1];

        array[0] = lastMember;
        array[array.length-1] = firstMember;

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
