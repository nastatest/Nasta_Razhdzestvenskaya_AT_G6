package main.java.project.bubbles;

public class Bubble {

    //у пузырька должен быть обьем, газовый состав
    //он должен уметь лопаться с выводом в консоль «Cramp!»
    //обьем пузырька постоянный и равен 0.3 мм2,
    // а газовый состав переменный в зависимости от образующего газа
    // и задается в конструкторе класса

    private double volume = 03;
    private String gas;

    public Bubble(String gas) { //передается строка с названием газа пузырька
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!"); //в консоль выводит слово "Cramp!"
    }

    public double getVolume() { //возвращающий обьем пузырька
        return volume;
    }
}
