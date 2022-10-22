package main.java.project.vessels;

import main.java.project.contents.Transformable;
import main.java.project.materials.Material;

public class Cup extends Vessel implements Containable {
    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() throws InterruptedException {

    }

    @Override
    public void close() {

    }

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Cup() {
    }
}
