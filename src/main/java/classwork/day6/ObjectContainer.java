package main.java.classwork.day6;

public class ObjectContainer {

    Object[] objects = new Object[10];

    int emptyPlace;

    public void add(Object incoming) {
        if (emptyPlace < objects.length) {
            objects[emptyPlace++] = incoming;
        }
    }

    public Object removeLast() {
        Object temp = objects[emptyPlace - 1];
        objects[emptyPlace-- - 1] = null;
        return temp;

    }

    public boolean isEmpty() {
        return emptyPlace == 0;
    }
}
