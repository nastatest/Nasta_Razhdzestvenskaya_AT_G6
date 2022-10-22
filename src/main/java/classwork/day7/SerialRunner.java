package main.java.classwork.day7;

import java.io.IOException;

public class SerialRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("V", 33, 180, 80);
        Person p2 = new Person("V", 33, 180, 80);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));

        SerialTask.write();
        SerialTask.read();
    }
}
