package main.java.project.runner;

import main.java.project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) {
        Bottle firstBottle = new Bottle(0.5);
        Bottle secondBottle = new Bottle(1.0);
        Bottle thirdBottle = new Bottle(1.5);

        firstBottle.open();
        secondBottle.open();
        thirdBottle.open();
    }
}
