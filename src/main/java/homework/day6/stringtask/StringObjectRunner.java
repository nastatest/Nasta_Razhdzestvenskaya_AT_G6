package main.java.homework.day6.stringtask;

public class StringObjectRunner {
    public static void main(String[] args) {
        PrintLettersInColumnTask printLettersInColumnTask = new PrintLettersInColumnTask();
        printLettersInColumnTask.printLettersInColumn("hello");
        System.out.println();

        PrintDuplicatesTask printDuplicatesTask = new PrintDuplicatesTask();
        printDuplicatesTask.printDuplicates("A feature of quantifiers is the possibility of using them in different modes: greedy, super-greedy and lazy.");
        System.out.println();

        PrintNumsToArrayTask printNumsToArrayTask = new PrintNumsToArrayTask();
        printNumsToArrayTask.printNumsToArray("abc1 ac 23 qw45 rty qwe 6 rty 7asd8f90");
        System.out.println();

        PrintAccessAttemptsFromLogTask printAccessAttemptsFromLogTask = new PrintAccessAttemptsFromLogTask();
        printAccessAttemptsFromLogTask.printAccessAttemptFromLog("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n");
        System.out.println();

        PrintDateTask printDateTask = new PrintDateTask();
        printDateTask.printDate();
        System.out.println();

        FormatDateTask formatDateTask = new FormatDateTask();
        formatDateTask.formatDate("22.00 07.09.2020");
    }
}
