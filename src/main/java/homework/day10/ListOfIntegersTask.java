package main.java.homework.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfIntegersTask {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = IntStream.rangeClosed(1, 255).boxed().collect(Collectors.toList());

        if (listOfIntegers.stream().anyMatch(x -> (x % 3 == 0) && (x % 5 == 0))) {
            System.out.println("в данной коллекции содержатся числа, которые делятся и на 3 и на 5 без остатка");
        } else {
            System.out.println("в данной коллекции не содержатся числа, которые делятся и на 3 и на 5 без остатка");
        }
    }
}

