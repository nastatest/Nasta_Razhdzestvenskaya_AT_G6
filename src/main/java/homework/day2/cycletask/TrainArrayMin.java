package main.java.homework.day2.cycletask;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainArrayMin {

    public void trainArrayMinViaStream() {

        Random random = new Random();

        List<Integer> array = Stream.generate(() -> random.nextInt(10))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(array);

        System.out.println("Min value is: " + array.stream().min(Integer::compareTo).get());
    }
}
