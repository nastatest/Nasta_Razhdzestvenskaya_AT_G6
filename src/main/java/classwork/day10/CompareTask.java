package main.java.classwork.day10;

import main.java.classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.classwork.day9.Person.Sex.MAN;
import static main.java.classwork.day9.Person.Sex.WOMAN;

public class CompareTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто", "очень");

        System.out.println(list.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList()));

        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList()));

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMAN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMAN),
                new Person("Роман Петрович", 72, MAN));

        people.stream().sorted((p1, p2) -> {
                    if (p1.sex != p2.sex) {
                        return p1.sex.compareTo(p2.sex);
                    } else {
                        return p1.age - p2.age;
                    }
                }
        ).peek(System.out::println).collect(Collectors.toList());
    }
}
