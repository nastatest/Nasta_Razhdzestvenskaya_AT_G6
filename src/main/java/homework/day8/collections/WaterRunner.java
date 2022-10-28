package main.java.homework.day8.collections;

import main.java.homework.day8.objects.Water;

import java.util.Arrays;
import java.util.List;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water waterItem : water) {
            System.out.println(waterItem.getColor() + " - " + waterItem.getSmell());
        }
    }
}
