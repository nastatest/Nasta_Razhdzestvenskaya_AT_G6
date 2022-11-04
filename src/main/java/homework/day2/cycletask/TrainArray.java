package main.java.homework.day2.cycletask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainArray {

    public void createArrayViaStream() {

        Random random = new Random();

        Stream.generate(() -> random.nextInt(7))
                .limit(7)
                .collect(Collectors.toList())
                .forEach(i -> System.out.print(i + " "));
    }
}
