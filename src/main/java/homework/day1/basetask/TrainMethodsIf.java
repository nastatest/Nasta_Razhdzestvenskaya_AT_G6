package main.java.homework.day1.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int x) {
        int newInt;
        if (x < 8) {
            newInt = x * 7;
        }
        else {
            newInt = x / 4;
        }
        return newInt;
    }

    public long returnNewLong(long y) {
        long newLong;
        if (y > 300) {
            newLong = y - 300;
        }
        else {
            newLong = y + 20;
        }
        return newLong;
    }

    public String returnNewChar(char a) {
        String newChar;
        if (a == 'g') {
            newChar = "go";
        }
        else {
            newChar = "o" + Character.toString(a);
        }
        return newChar;
    }

    public float returnNewFloat(float b) {
        float newFloat;
        if (b == 0.67) {
            newFloat = b;
        }
        else {
            newFloat = b * 2;
        }
        return newFloat;
    }

    public double returnNewDouble(double c) {
        double newDouble;
        if (c > 30 && c < 80) {
            newDouble = c + 87;
        }
        else if (c > 80 && c < 400) {
            newDouble = c - 87;
        }
        else if (c > 400) {
            newDouble = c / 4;
        }
        else {
            newDouble = c;
        }
        return newDouble;
    }

    public void returnNewBoolean(boolean d) {
        if (d = true) {
            System.out.println("Я получил на вход значение истины");
        }
        else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
