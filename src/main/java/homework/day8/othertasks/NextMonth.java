package main.java.homework.day8.othertasks;

import java.util.Scanner;

public class NextMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any month:");

        String month = scanner.next();
        String nextMonth = null;

        switch (month) {
            case "January":
                nextMonth = "February";
                break;
            case "February":
                nextMonth = "March";
                break;
            case "March":
                nextMonth = "April";
                break;
            case "April":
                nextMonth = "May";
                break;
            case "May":
                nextMonth = "June";
                break;
            case "June":
                nextMonth = "July";
                break;
            case "July":
                nextMonth = "August";
                break;
            case "August":
                nextMonth = "September";
                break;
            case "September":
                nextMonth = "October";
                break;
            case "October":
                nextMonth = "November";
                break;
            case "November":
                nextMonth = "December";
                break;
            case "December":
                nextMonth = "January";
                break;
            default:
                System.out.println("Incorrect month");
        }

        System.out.println("Next month is " + nextMonth);
    }
}