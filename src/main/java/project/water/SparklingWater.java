package main.java.project.water;

import main.java.project.water.Water;

public class SparklingWater  extends Water {
    //у газировки есть пузырьки
    //вода заполняется пузырьками при упаковке на заводе,
    // для этого у нее есть метод pump(Bubble[] bubbles)
    //1 литр воды содержит 10 тыс пузырьков
    //у газировки есть метод degas(),
    // который удаляет пузырьки по одному и вызывает их лопанье

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() { // вызывает внутренний метод isOpened();

    }

    public void pump(Bubble[] bubbles) { // сетает массив из пузырьков в воду

    }

    public void setOpened(boolean isOpened) { // меняет состояние воды на "открытое"

    }

    private void isOpened() { // в новом потоке проверят состояние воды на "открытость"
                                // и в случае, если она открыта запускает метод degas()
    }

    private void degas() { // каждую секунду выпускает по партии пузырьков
                            // из рассчета 10 + 5 * температура_воды
    }

    public boolean isSparkle() { //возвращающий true если в воде еще есть пузырьки газа

    }
}
