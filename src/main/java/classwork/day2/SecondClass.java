package main.java.classwork.day2;

public class SecondClass {

    public void foo() {
        int x = 0;
        for (int i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            x = i;
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + x);
    }
}
