package main.java.homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {

        TrainMethodsIf train = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + train.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + train.returnNewLong(555));
        System.out.println("метод returnNewChar вернул " + train.returnNewChar('k'));
        System.out.println("метод returnNewFloat вернул " + train.returnNewFloat(0.5f));
        System.out.println("метод returnNewDouble вернул " + train.returnNewDouble(225.225));
        train.returnNewBoolean(true);
    }
}
