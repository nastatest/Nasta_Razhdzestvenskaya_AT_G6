package main.java.homework.day1.basetask;

public class Bee {

    private String gender;
    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) { //милиграммы
        this.weight = weight;
    }

    public void printBeeDetails() {
        long relativeWeight = 500000000 / getWeight();
        System.out.println("Я легче лося в " + relativeWeight + " раз");
    }
}
