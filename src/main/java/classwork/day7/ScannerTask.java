package main.java.classwork.day7;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.printf("Just go '%s' next!", incoming);
        }
    }
}
