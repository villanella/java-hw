package org.homework12.app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class ConsoleInputReader implements InputReader {
    private Scanner scanner;

    public ConsoleInputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInput(String prompt) {
        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print(prompt);
                number = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }
        scanner.nextLine(); // Read the next line to clear the buffer
        return number;
    }
}