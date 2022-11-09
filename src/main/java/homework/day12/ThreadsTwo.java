package main.java.homework.day12;

import java.util.ArrayList;

public class ThreadsTwo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t5 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t6 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t7 = new Thread(() -> {
            try {
                createAndPeepEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();

    }

    public static void createAndPeepEven() throws InterruptedException {

        ArrayList<Mouse> mouseCollection = new ArrayList<>();

        for (int i = 1; i <= 18; i++) {
            Mouse mouse = new Mouse(i);
            mouseCollection.add(mouse);
        }

        for (int i = 1; i < mouseCollection.size(); i += 2) {
                mouseCollection.get(i).peep();
        }
    }
}

