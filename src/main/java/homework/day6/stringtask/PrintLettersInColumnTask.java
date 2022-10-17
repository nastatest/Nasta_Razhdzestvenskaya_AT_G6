package main.java.homework.day6.stringtask;

public class PrintLettersInColumnTask {
    public void printLettersInColumn(String string) {
        String[] column = string.split("");
        for (String letter : column) {
            System.out.println(letter);
        }
    }
}
