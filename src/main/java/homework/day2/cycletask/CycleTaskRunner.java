package main.java.homework.day2.cycletask;

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
        trainArrayInverse.print();
        trainArrayInverse.printArrayInverse();

        TrainArrayMultiply trainArrayMultiply = new TrainArrayMultiply();
        trainArrayMultiply.print();
        trainArrayMultiply.multiplyArray();

        TrainArraySquare trainArraySquare = new TrainArraySquare();
        trainArraySquare.print();
        trainArraySquare.squareArray();

        TrainArrayMin trainArrayMin = new TrainArrayMin();
        trainArrayMin.print();
        trainArrayMin.findMinValue();

        TrainArrayReplace trainArrayReplace = new TrainArrayReplace();
        trainArrayReplace.print();
        trainArrayReplace.replaceArrayMembers();
        trainArrayReplace.print();

        TrainArraySort trainArraySort = new TrainArraySort();
        trainArraySort.print();
        trainArraySort.sortArray();
        trainArraySort.print();
    }
}
