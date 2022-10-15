package main.java.project.boxing;

import main.java.project.bubbles.Bubble;
import main.java.project.water.Water;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        int bubblesCount = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[bubblesCount];
        water.pump(bubbles);
    }

    public void open() {
        water.setOpened(true);
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

   public Water getWater() {
        return water;
   }

   public void setWater(Water water) {
        this.water = water;
   }
}
