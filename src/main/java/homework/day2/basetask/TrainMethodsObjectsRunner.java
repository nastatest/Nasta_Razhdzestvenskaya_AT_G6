package main.java.homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        TrainMethodsObjects train = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Пик", 5);
        train.processMouse(mouse);

        Sauce sauce = new Sauce("Бешамель", "белого");
        train.processSauce(sauce);

        Bee bee = new Bee("Ж", 100);
        train.processBee(bee);

        Obstacle obstacle = new Obstacle("кирпич", "серьезное");
        train.processObstacle(obstacle);

        Pineapple pineapple = new Pineapple("Маврикий", 1.700);
        train.processPineapple(pineapple);
    }
}
