package main.java.homework.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileTask {

    public static void main(String[] args) throws IOException {

        BufferedReader readFile = new BufferedReader(new FileReader("readFile.txt"));

        List<String> lines = new ArrayList<>();
        while (readFile.ready()) {
            String line = readFile.readLine();
            lines.add(line);
        }
        readFile.close();

        String newText = lines.stream()
                .skip(4)
                .reduce((l1, l2) -> l1 + l2)
                .get();

        List<String> editedText = List.of(newText.split("<br>"));

        LocalDateTime date = LocalDateTime.now();

        System.out.println(editedText.stream().filter(s -> s.startsWith("Date log:"))
                .map(s -> s.substring(0, 20))
                .map(s -> s + " " + date)
                .collect(Collectors.toList()));
    }
}
