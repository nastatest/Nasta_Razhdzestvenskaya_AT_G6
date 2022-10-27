package main.java.homework.day8.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        Pattern pattern = Pattern.compile("\\w+");
        int elementsWithMoreThanOneWord = 0;
        for (String element : elements) {
            Matcher matcher = pattern.matcher(element);
            if (matcher.results().count() > 1) {
                elementsWithMoreThanOneWord++;
            }
        }
        System.out.println(elementsWithMoreThanOneWord);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
