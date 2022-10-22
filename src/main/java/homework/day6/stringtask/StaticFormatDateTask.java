package main.java.homework.day6.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StaticFormatDateTask {
    public static void formatDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);
        System.out.printf("%1$tB, %1$te, %1$tY %1$tT", date);
    }
}
