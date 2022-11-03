package main.java.homework.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PersonListTask {

    public static void main(String[] args) {

        List<Person> people = IntStream.rangeClosed(1, 100).boxed()
                .map((x) -> new Person(randomName(), randomSurname(), randomAge()))
                .collect(Collectors.toList());

        List<String> fourNames = people.stream().filter(p -> p.getAge() < 21)
                .peek(p -> System.out.println("name: " + p.getName() + ", surname: " + p.getSurname()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(fourNames);

    }

    public static String randomName() {
        List<String> names = Arrays.asList("John", "Harry", "Mary", "Jimmy", "Kurt", "Alice", "Michael", "Marilyn", "Joe", "Donald");
        Random randomN = new Random();
        return names.get(randomN.nextInt(10));
    }

    public static String randomSurname() {
        List<String> surnames = Arrays.asList("Snow", "Potter", "Poppins", "Hendrix", "Cobain", "Cooper", "Jackson", "Manson", "Black", "Duck");
        Random randomS = new Random();
        return surnames.get(randomS.nextInt(10));
    }

    public static int randomAge() {
        int minAge = 15;
        int maxAge = 31;
        Random randomA = new Random();
        return randomA.nextInt(maxAge - minAge + 1) + minAge;
    }
}
