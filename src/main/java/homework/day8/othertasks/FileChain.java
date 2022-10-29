package main.java.homework.day8.othertasks;

import java.io.*;
import java.util.Random;

public class FileChain {

    public static void main(String[] args) throws IOException {

        File directory = new File(
                "/Users/nastassyarazhdzestvenskaya/Documents/TestDir1/TestDir2/TestDir3/TestDir4");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File file1 = File.createTempFile("file", ".txt",
                new File("/Users/nastassyarazhdzestvenskaya/Documents/TestDir1/TestDir2/TestDir3/TestDir4"));
        File file2 = File.createTempFile("file", ".txt",
                new File("/Users/nastassyarazhdzestvenskaya/Documents/TestDir1/TestDir2/TestDir3/TestDir4"));

        Random random = new Random();

        BufferedWriter out1 = new BufferedWriter(new FileWriter(file1.getAbsolutePath()));
        for (int i = 0; i < 10; i++) {
            String str = String.valueOf(random.nextInt(100));
            out1.write(str + " ");
        }
        out1.close();

        BufferedWriter out2 = new BufferedWriter(new FileWriter(file2.getAbsolutePath()));
        for (int i = 0; i < 10; i++) {
            String str = String.valueOf(random.nextInt(100));
            out2.write(str + " ");
        }
        out2.close();
    }
}
