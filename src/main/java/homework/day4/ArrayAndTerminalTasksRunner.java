package main.java.homework.day4;

public class ArrayAndTerminalTasksRunner {

    public static void main(String[] args) {

        ArrayAndTerminalTasks task = new ArrayAndTerminalTasks();

        task.sumOfElements(new int[]{1, 2, 3, 4, 5}, 2);

        int[] newArray = task.inverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3);
        task.print(newArray);

        int sum = task.multipleMonthSum(new int[]{20, 8, 95, 16, 200});
        System.out.println(sum);

        task.printHorsePicture();
    }
}
