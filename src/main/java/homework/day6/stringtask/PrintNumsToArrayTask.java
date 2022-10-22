package main.java.homework.day6.stringtask;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintNumsToArrayTask {

    public void printNumsToArray(String string) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        ArrayList<Integer> tempArray = new ArrayList<>();
        while (matcher.find()) {
            tempArray.add(Integer.parseInt(matcher.group()));
        }
        int[] numArray = new int[tempArray.size()];
        for (int count = 0; count < tempArray.size(); count++) {
            numArray[count] = tempArray.get(count);
        }
        for (int arrayMember : numArray) {
            System.out.print(arrayMember + " ");
        }
        System.out.println();
    }
}
