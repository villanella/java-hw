package org.homework12.app;
import java.io.*;
import java.util.*;

public class FileInputReader implements InputReader {
    private String filename;

    public FileInputReader(String filename) {
        this.filename = filename;
    }

    public int readInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Invalid input source. Falling back to console input.");
        int number = new ConsoleInputReader(scanner).readInput(prompt);
        scanner.close();
        return number;
    }
}