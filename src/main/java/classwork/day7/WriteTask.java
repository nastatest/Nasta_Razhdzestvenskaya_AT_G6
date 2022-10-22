package main.java.classwork.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {
    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("мама мыла милу");
        out.close();
    }
}
