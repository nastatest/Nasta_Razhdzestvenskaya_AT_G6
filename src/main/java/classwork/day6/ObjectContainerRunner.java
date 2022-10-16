package main.java.classwork.day6;

import java.util.Random;

public class ObjectContainerRunner {
    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();
        Random random = new Random();
        for (int count = 0; count < 10; count++) {
            objectContainer.add(random.nextInt(100));
        }
        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }
    }
}
