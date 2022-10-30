package main.java.classwork.day10;

import main.java.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.classwork.day9.Person.Sex.MAN;
import static main.java.classwork.day9.Person.Sex.WOMAN;

public class JoinTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто", "очень");

        String newString = list.stream().collect(Collectors.joining(":", "<p>", "</p>"));
        System.out.println(newString);

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMAN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMAN),
                new Person("Роман Петрович", 72, MAN));

        people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p));

        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
    }
}
