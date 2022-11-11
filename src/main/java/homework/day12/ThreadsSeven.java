package main.java.homework.day12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadsSeven {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Mouse> mouseCollection = new ArrayList<>();

        for (int i = 1; i <= 240; i++) {
            Mouse mouse = new Mouse(i);
            mouseCollection.add(mouse);
        }

        Object lock = new Object();

        Pattern p = Pattern.compile("\\d+");

        Thread t1 = new Thread(() -> {
            int count = 0;
            while (count < mouseCollection.size()) {
                synchronized (lock) {
                    try {
                        Matcher m = p.matcher(mouseCollection.get(count).getName());
                        m.find();
                        int n = Integer.parseInt(m.group());
                        if (n % 2 == 1) {
                            System.out.println("thread 1"); //to see better the threads
                            mouseCollection.get(count).peep();
                            mouseCollection.remove(count);
                            Thread.sleep(250);
                        } else count++;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            int count = 0;
            while (count < mouseCollection.size()) {
                synchronized (lock) {
                    try {
                        Matcher m = p.matcher(mouseCollection.get(count).getName());
                        m.find();
                        int n = Integer.parseInt(m.group());
                        if (n % 2 == 0) {
                            System.out.println("thread 2"); //to see better the threads
                            mouseCollection.get(count).peep();
                            Hedgehog hedgehog = new Hedgehog(n);
                            hedgehog.tellMe();
                            Thread.sleep(220);
                            count++;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t3 = new Thread(() -> {
            int count = 0;
            while (count < mouseCollection.size()) {
                synchronized (lock) {
                    try {
                        Matcher m = p.matcher(mouseCollection.get(count).getName());
                        m.find();
                        int n = Integer.parseInt(m.group());
                        if (n % 2 == 1) {
                            System.out.println("thread 3"); //to see better the threads
                            mouseCollection.get(count).peep();
                            mouseCollection.remove(count);
                            Thread.sleep(250);
                        } else count++;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t4 = new Thread(() -> {
            int count = 0;
            while (count < mouseCollection.size()) {
                synchronized (lock) {
                    try {
                        Matcher m = p.matcher(mouseCollection.get(count).getName());
                        m.find();
                        int n = Integer.parseInt(m.group());
                        if (n % 2 == 0) {
                            System.out.println("thread 4"); //to see better the threads
                            mouseCollection.get(count).peep();
                            Hedgehog hedgehog = new Hedgehog(n);
                            hedgehog.tellMe();
                            Thread.sleep(220);
                            count++;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t5 = new Thread(() -> {
            int count = 0;
            while (count < mouseCollection.size()) {
                synchronized (lock) {
                    try {
                        Matcher m = p.matcher(mouseCollection.get(count).getName());
                        m.find();
                        int n = Integer.parseInt(m.group());
                        if (n % 2 == 1) {
                            System.out.println("thread 5"); //to see better the threads
                            mouseCollection.get(count).peep();
                            mouseCollection.remove(count);
                            Thread.sleep(250);
                        } else count++;
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

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
    }
}
