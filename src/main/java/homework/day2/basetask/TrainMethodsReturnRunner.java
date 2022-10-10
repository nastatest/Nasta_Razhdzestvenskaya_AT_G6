package main.java.homework.day2.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {

        TrainMethodsReturn train = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + train.returnNewInt(8905623));
        System.out.println("метод returnNewLong вернул " + train.returnNewLong(89056238790L));
        System.out.println("метод returnNewChar вернул " + train.returnNewChar('k'));
        System.out.println("метод returnNewFloat вернул " + train.returnNewFloat(890.09f));
        System.out.println("метод returnNewDouble вернул " + train.returnNewDouble(8.905623));
        System.out.println("метод returnNewShort вернул " + train.returnNewShort((short) 1200));
        System.out.println("метод returnNewByte вернул " + train.returnNewByte((byte) 120));
        System.out.println("метод returnNewBoolean вернул " + train.returnNewBoolean(false));
    }
}
