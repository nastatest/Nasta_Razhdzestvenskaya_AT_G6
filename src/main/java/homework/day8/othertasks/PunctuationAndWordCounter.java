package main.java.homework.day8.othertasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationAndWordCounter {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("text.txt"));

        Pattern wordPattern = Pattern.compile("\\b[а-яА-Яa-zA-Z]+\\b");
        Pattern punctPattern = Pattern.compile("\\p{Punct}");

        int words = 0;
        int punctMarks = 0;

        while (in.ready()) {
            String string = in.readLine();
            Matcher wordMatcher = wordPattern.matcher(string);
            Matcher punctMatcher = punctPattern.matcher(string);
            words += (int) wordMatcher.results().count();
            punctMarks += (int) punctMatcher.results().count();
        }

        System.out.println("Кол-во слов в тексте: " + words);
        System.out.println("Кол-во знаков препинания в тексте: " + punctMarks);

        in.close();
    }
}
