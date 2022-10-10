package main.java.classwork.day2;

public class FourthClass {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void printArray() {

        System.out.print("{ ");
        int n = 0;
        for (int[] innerArray : array) {
            System.out.print("{ ");
            int i = 0;
            for (int x : innerArray) {
                if (i < array.length - 1) {
                    System.out.print(x + ",");

                } else {
                    System.out.print(x);
                }
                i++;

            }

            if (n < array.length - 1) {
                System.out.print(" },");
                System.out.println();
            } else {
                System.out.print(" }");
            }
            n++;

        }
        System.out.print(" }");
    }
}
