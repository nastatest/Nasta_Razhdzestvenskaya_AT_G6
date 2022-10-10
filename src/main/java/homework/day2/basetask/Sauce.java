package main.java.homework.day2.basetask;

public class Sauce {

    private String name;
    private String color;

    public Sauce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSauceDetails() {
        System.out.println("Это соус " + getName() + " " + getColor() + " цвета");
    }
}
