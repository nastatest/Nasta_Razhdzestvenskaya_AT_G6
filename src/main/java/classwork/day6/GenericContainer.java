package main.java.classwork.day6;

public class GenericContainer <T>{
    private T[] objects;
    private int emptyPlace;

    public GenericContainer() {
        objects=(T[]) new Object[10];
        emptyPlace = 0;
    }

    public void add(T incoming) {
        if (emptyPlace < objects.length) {
            objects[emptyPlace++] = incoming;
        }
    }

    public T removeLast() {
        T temp = objects[emptyPlace - 1];
        objects[emptyPlace-- - 1] = null;
        return temp;

    }

    public boolean isEmpty() {
        return emptyPlace == 0;
    }
}
