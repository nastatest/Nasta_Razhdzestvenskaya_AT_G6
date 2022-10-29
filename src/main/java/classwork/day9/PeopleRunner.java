package main.java.classwork.day9;

import java.util.Arrays;
import java.util.List;

import static main.java.classwork.day9.Person.Sex.MAN;
import static main.java.classwork.day9.Person.Sex.WOMAN;

public class PeopleRunner {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMAN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMAN),
                new Person("Роман Петрович", 72, MAN));

        int counter = 0;
        for (Person person : people) {
            if (person.age > 18 && ((person.age < 60 && person.sex == MAN)
                    || (person.age < 55 && person.sex == WOMAN))) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(people.stream().filter(person -> person.age > 18 && ((person.age < 60 && person.sex == MAN)
                || (person.age < 55 && person.sex == WOMAN))).count());
    }
}
