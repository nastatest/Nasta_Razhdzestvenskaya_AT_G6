package main.java.project.boxing;

import main.java.project.bubbles.Bubble;
import main.java.project.water.SparklingWater;
import main.java.project.water.Water;

public class Bottle {

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

    public void open() throws InterruptedException {
        System.out.println("The state of bottle is opened now.");
        ((SparklingWater) water).setOpened(true);
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
}
