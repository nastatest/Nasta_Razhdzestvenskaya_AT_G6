package main.java.classwork.day6;

public class GenericContainerRunner {
    public static void main(String[] args) {
        GenericContainer<Integer>container = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            container.add(i);
        }
        System.out.println(container + "-created!\n");
        while (!container.isEmpty()) {
            int integer = container.removeLast();
            System.out.println("Number" + integer + "removed..");
        }
    }
}
