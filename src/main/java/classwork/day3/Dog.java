package main.java.classwork.day3;

import java.util.Random;

public class Dog extends Mammals {

    private int boneAffinity = 23;

    public Dog(int age, String name, String breed) {
        super(age, name, breed);
    }

    public int getBoneAffinity() {
        return boneAffinity;
    }

    public void setBoneAffinity(int boneAffinity) {
        this.boneAffinity = boneAffinity;
    }

    public int bringBone() {
        return boneAffinity * new Random().nextInt(234);
    }
}
