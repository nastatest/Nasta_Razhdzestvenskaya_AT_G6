package main.java.homework.day1.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int x) {
        int newInt = x * 3;
        return newInt;
    }

    public long returnNewLong(long y) {
        long newLong = y - 4;
        return newLong;
    }

    public String returnNewChar(char a) {
        String newChar = Character.toString(a) + Character.toString(a);
        return newChar;
    }

    public float returnNewFloat(float b) {
        float newFloat = b / 2;
        return newFloat;
    }

    public double returnNewDouble(double c) {
        double newDouble = c + 8;
        return newDouble;
    }

    public int returnNewShort(short d) {
        int newShort = d - 1;
        return newShort;
    }

    public int returnNewByte(byte e) {
        int newByte = e * 2;
        return newByte;
    }

    public boolean returnNewBoolean(boolean f) {
        boolean newBoolean = !f;
        return newBoolean;
    }

}
