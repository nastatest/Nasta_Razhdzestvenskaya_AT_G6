package main.java.project.contents;

import main.java.project.bubbles.Bubble;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater() throws InterruptedException {
        System.out.println("Sparkling water is created.");
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        System.out.println("Water is filled with bubbles.");
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) throws InterruptedException {
        System.out.println("The state of water is changed.");
        this.isOpened = isOpened;
        isOpened();
    }

    private void isOpened() throws InterruptedException {
        System.out.println("Checking if the state of water is opened.");
        if (isOpened) {
            this.degas();
        }
    }

    protected void degas() throws InterruptedException {
        System.out.println("Bubbles are being removed from water.");
        int bubblesToCramp = 10 + 5 * getTemperature();
        int firstBubbleToCramp = 0;
        int lastBubbleToCramp = bubblesToCramp - 1;
        while (firstBubbleToCramp < bubbles.length) {
            for (int i = firstBubbleToCramp; i <= lastBubbleToCramp && i < bubbles.length; i++) {
                bubbles[i].cramp();
                bubbles[i] = null;
            }
            Thread.sleep(1000);
            firstBubbleToCramp = lastBubbleToCramp + 1;
            lastBubbleToCramp += bubblesToCramp;
        }
    }

    public boolean isSparkle() {
        System.out.println("Checking if water still contains any bubbles.");
        return bubbles.length != 0;
    }

    @Override
    public void mix() {

    }
}

