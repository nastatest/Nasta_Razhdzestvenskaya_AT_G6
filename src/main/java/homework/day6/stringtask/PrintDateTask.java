package main.java.homework.day6.stringtask;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class PrintDateTask {
    public void printDate() {
        Date date = new Date();
        System.out.printf("Сейчас на дворе: %1$td %1$tB, %1$tY, %1$tH часа %1$tM минут\n", date);
    }
}
