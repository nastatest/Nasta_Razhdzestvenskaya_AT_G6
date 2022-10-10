package main.java.homework.day2.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int intNum) {
        if (intNum < 8) {
            return intNum * 7;
        } else {
            return intNum / 4;
        }
    }

    public long returnNewLong(long longNum) {
        if (longNum > 300) {
            return longNum - 300;
        } else {
            return longNum + 20;
        }
    }

    public String returnNewChar(char character) {
        if (character == 'g') {
            return "go";
        } else {
            return "o" + character;
        }
    }

    public float returnNewFloat(float floatNum) {
        if (floatNum == 0.67) {
            return floatNum;
        } else {
            return floatNum * 2;
        }
    }

    public double returnNewDouble(double doubleNum) {
        if (doubleNum > 30 && doubleNum < 80) {
            return doubleNum + 87;
        } else if (doubleNum > 80 && doubleNum < 400) {
            return doubleNum - 87;
        } else if (doubleNum > 400) {
            return doubleNum / 4;
        } else {
            return doubleNum;
        }
    }

    public void returnNewBoolean(boolean bool) {
        if (bool) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
