package main.java.project.bubbles;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        System.out.println("A bubble of specified gas is created.");
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("The bubble bursts with a sound.");
        System.out.println("Cramp!");
    }

    public double getVolume() { //возвращающий обьем пузырька
        return volume;
    }
}
