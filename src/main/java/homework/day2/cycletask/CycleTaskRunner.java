package main.java.homework.day2.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        TrainWhile trainWhile = new TrainWhile();
        trainWhile.printNumbers();

        TrainFor trainFor = new TrainFor();
        trainFor.printOdd();

        TrainArray trainArray = new TrainArray();
        trainArray.createArrayViaStream();

        TrainArrayPrint trainArrayPrint = new TrainArrayPrint();
        trainArrayPrint.printArrayViaStream();

        TrainArrayInverse trainArrayInverse = new TrainArrayInverse();
        trainArrayInverse.printArrayInverseViaStream();

        TrainArrayMultiply trainArrayMultiply = new TrainArrayMultiply();
        trainArrayMultiply.multiplyArrayViaStream();

        TrainArraySquare trainArraySquare = new TrainArraySquare();
        trainArraySquare.print();
        trainArraySquare.squareArray();

        TrainArrayMin trainArrayMin = new TrainArrayMin();
        trainArrayMin.trainArrayMinViaStream();

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
