package main.java.classwork.day10;

import main.java.classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.classwork.day9.Person.Sex.MAN;
import static main.java.classwork.day9.Person.Sex.WOMAN;

public class ThirdTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто", "очень");

        String maxS = list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .peek(System.out::println)
                .max(String::compareTo)
                .get();
        System.out.println(maxS);

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMAN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMAN),
                new Person("Роман Петрович", 72, MAN));

        Person minPerson = people.stream()
                .min(Comparator.comparingInt(p -> p.age))
                .get();
        System.out.println(minPerson);
    }
}
