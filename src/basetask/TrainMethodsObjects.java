package basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse) {
        System.out.println("имя " + mouse.getName());
        System.out.println("возраст " + mouse.getAge() + " лет");
        mouse.printMouseDetails();
    }

    public void processSauce(Sauce sauce) {
        System.out.println("имя " + sauce.getName());
        System.out.println("цвет " + sauce.getColor());
        sauce.printSauceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("пол " + bee.getGender());
        System.out.println("вес " + bee.getWeight() + " мг");
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("препятствие: " + obstacle.getDescription());
        System.out.println("важность: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("сорт: " + pineapple.getGrade());
        System.out.println("теплоемкость: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
