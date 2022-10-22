package main.java.homework.day6.stringtask;

public class StringStaticRunner {
    public static void main(String[] args) {

        StaticPrintLettersInColumn.printLettersInColumn("hello");
        System.out.println();

        StaticPrintDuplicates.printDuplicates("A feature of quantifiers is the possibility of using them in different modes: greedy, super-greedy and lazy.");
        System.out.println();

        StaticPrintNumsToArray.printNumsToArray("abc1 ac 23 qw45 rty qwe 6 rty 7asd8f90");
        System.out.println();

        StaticPrintAccessAttemptsFromLog.printAccessAttemptFromLog("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 21.168.101.6 granted\n");
        System.out.println();

        StaticPrintDate.printDate();
        System.out.println();

        StaticFormatDateTask.formatDate("22.00 07.09.2020");
        System.out.println();

        StaticGenerateVowelDate.generateVowelDate("блаблаблаоооооооооооооооооооооооеееееееееееееееееУУЦ");
    }
}
