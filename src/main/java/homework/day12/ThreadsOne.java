package main.java.homework.day12;

import java.util.ArrayList;

public class ThreadsOne {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                createAndPeep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                createAndPeep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                createAndPeep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                createAndPeep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t5 = new Thread(() -> {
            try {
                createAndPeep();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void createAndPeep() throws InterruptedException {

        ArrayList<Mouse> mouseCollection = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            Mouse mouse = new Mouse(i);
            mouseCollection.add(mouse);
        }

        for (Mouse mouse : mouseCollection) {
            mouse.peep();
        }
    }
}
