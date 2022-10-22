package main.java.project.vessels;

import main.java.project.bubbles.Bubble;
import main.java.project.contents.SparklingWater;
import main.java.project.contents.Transformable;
import main.java.project.contents.Water;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private Water water;

    public Bottle(double volume) throws InterruptedException {
        System.out.println("A bottle is created.");
        this.volume = volume;
        this.water = new SparklingWater();
        int bubblesCount = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[bubblesCount];
        for (int count = 0; count < bubbles.length; count++) {
            bubbles[count] = new Bubble("CO2");
        }
        ((SparklingWater) water).pump(bubbles);
    }

    public Bottle() {

    }

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

    public void open() throws InterruptedException {
        System.out.println("The state of bottle is opened now.");
        ((SparklingWater) water).setOpened(true);
    }

    @Override
    public void close() {

    }

    public void warm(int temperature) {
        System.out.printf("Water is being warmed to %s", temperature).println();
        water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
