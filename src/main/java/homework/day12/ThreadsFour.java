package main.java.homework.day12;

import java.util.ArrayList;

public class ThreadsFour {

    public static void main(String[] args) {

        ArrayList<Mouse> mouseCollection = new ArrayList<>();

        for (int i = 1; i <= 280; i++) {
            Mouse mouse = new Mouse(i);
            mouseCollection.add(mouse);
        }

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (mouseCollection.size() > 0) {
                    try {
                        mouseCollection.get(0).peep();
                        mouseCollection.remove(0);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                while (mouseCollection.size() > 0) {
                    try {
                        mouseCollection.get(0).peep();
                        mouseCollection.remove(0);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                while (mouseCollection.size() > 0) {
                    try {
                        mouseCollection.get(0).peep();
                        mouseCollection.remove(0);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                while (mouseCollection.size() > 0) {
                    try {
                        mouseCollection.get(0).peep();
                        mouseCollection.remove(0);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                while (mouseCollection.size() > 0) {
                    try {
                        mouseCollection.get(0).peep();
                        mouseCollection.remove(0);
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
