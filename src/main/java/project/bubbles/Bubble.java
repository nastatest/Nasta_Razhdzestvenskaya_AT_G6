package main.java.project.bubbles;

public class Bubble {

    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) { //передается строка с названием газа пузырька
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() { //возвращающий обьем пузырька
        return volume;
    }
}
