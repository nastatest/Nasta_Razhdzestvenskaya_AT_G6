package main.java.homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        TrainWhile trainWhile = new TrainWhile();
        trainWhile.printNumbers();

        TrainFor trainFor = new TrainFor();
        trainFor.printOdd();

        TrainArray trainArray = new TrainArray();
        trainArray.createArray();

        TrainArrayPrint trainArrayPrint = new TrainArrayPrint();
        trainArrayPrint.printArray();

        TrainArrayInverse trainArrayInverse = new TrainArrayInverse();
        trainArrayInverse.printArrayInverse();

        TrainArrayMultiply trainArrayMultiply = new TrainArrayMultiply();
        trainArrayMultiply.multiplyArray();

        TrainArraySquare trainArraySquare = new TrainArraySquare();
        trainArraySquare.squareArray();

        TrainArrayMin trainArrayMin = new TrainArrayMin();
        trainArrayMin.findMinValue();

        TrainArrayReplace trainArrayReplace = new TrainArrayReplace();
        trainArrayReplace.replaceArrayMembers();

        TrainArraySort trainArraySort = new TrainArraySort();
        trainArraySort.print();
        trainArraySort.sortArray();
        trainArraySort.print();
    }
}
