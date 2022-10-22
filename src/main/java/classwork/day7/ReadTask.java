package main.java.classwork.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTask {
    public static void read() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
