package main.java.homework.day6.stringtask;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaticGenerateVowelDate {
    public static void generateVowelDate(String string) {
        Pattern pattern = Pattern.compile("[уеёэоаыяиюУЕЁЭОАЫЯИЮ]");
        Matcher matcher = pattern.matcher(string);

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime newDate = currentTime.plusDays(matcher.results().count());
        System.out.printf("Сгенерированная гласная дата: %1$te %1$tB", newDate);
    }
}
