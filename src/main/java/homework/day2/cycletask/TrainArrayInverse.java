package main.java.homework.day2.cycletask;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainArrayInverse {

    public void printArrayInverseViaStream() {

        Random random = new Random();

        List<Integer> array = Stream.generate(() -> random.nextInt(10))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(array);

        List<Integer> reverseArray = array.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                    Collections.reverse(l);
                    return l;
                }));

        System.out.println(reverseArray);
    }
}
