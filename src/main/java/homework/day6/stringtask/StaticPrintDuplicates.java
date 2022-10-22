package main.java.homework.day6.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaticPrintDuplicates {
    private static String regex = "(\\b\\w+\\b).*\\1";

    public static void printDuplicates(String string) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
