package main.java.project.water;

import main.java.project.bubbles.Bubble;
import main.java.project.water.Water;

public class SparklingWater  extends Water {

    private Bubble[] bubbles;

    private boolean isOpened;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        isOpened();
    }

    private void isOpened() {
        if (isOpened) {
            this.degas();
        }
    }

    protected void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
        // каждую секунду выпускает по партии пузырьков
        // из рассчета 10 + 5 * температура_воды
    }

   // public boolean isSparkle() {  } //возвращающий true если в воде еще есть пузырьки газа
    }

