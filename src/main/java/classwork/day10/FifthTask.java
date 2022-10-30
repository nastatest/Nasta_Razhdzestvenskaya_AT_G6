package main.java.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FifthTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто", "очень");

        int sum = list.stream().mapToInt(s -> {
                    if (s.length() % 2 != 0) {
                        return s.length();
                    } else return 0;
                }
        ).sum();

        int sum2 = list.stream().map(String::length).mapToInt(p -> p % 2 == 1 ? p : 0).sum();

        System.out.println(sum);
        System.out.println(sum2);
    }
}
