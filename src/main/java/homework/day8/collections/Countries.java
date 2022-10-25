package main.java.homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        StringBuilder countryString = new StringBuilder();
        for (String country : countries) {
            countryString.append(country).append(", ");
        }
        String countriesWithComma = countryString.toString();
        if (countriesWithComma.length() > 1) {
            countriesWithComma = countriesWithComma.substring(0, countriesWithComma.length() - 2);
        }
        System.out.println(countriesWithComma);

        int lessThanSevenLetters = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                lessThanSevenLetters++;
            }
        }
        System.out.println(lessThanSevenLetters);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
