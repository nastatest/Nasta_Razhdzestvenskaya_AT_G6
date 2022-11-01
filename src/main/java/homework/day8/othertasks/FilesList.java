package main.java.homework.day8.othertasks;

import java.io.File;

public class FilesList {

    public static void main(String[] args) {

        File folder = new File("/Users/nastassyarazhdzestvenskaya/Documents");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
