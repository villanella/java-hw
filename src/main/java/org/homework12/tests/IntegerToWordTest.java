package org.homework12.tests;

import org.homework12.app.*;

import static org.homework8.assertions.Assertions.assertEquals;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class IntegerToWordTest {
    @Test
    public void testConvertToWord() {
        // Test cases for convertToWord method
        try {
            assertEquals("1 рубль", IntegerToWord.convertToWord(1));
            assertEquals("22 рубля", IntegerToWord.convertToWord(22));
            assertEquals("305 рублей", IntegerToWord.convertToWord(305));
            assertEquals("1000 рублей", IntegerToWord.convertToWord(1000));

            System.out.println("testConvertToWord passed.");

        } catch (AssertionError e) {
            System.err.println("testConvertToWord failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("testConvertToWord failed with an unexpected exception: " + e.getMessage());
        }
    }
    @Test
    public void testConsoleInputReader() {
        // Test case for ConsoleInputReader
        String input = "42\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        try {

            Scanner scanner = new Scanner(System.in);
            ConsoleInputReader inputReader = new ConsoleInputReader(scanner);
            int number = inputReader.readInput("Enter an integer: ");
            assertEquals(42, number);

            System.setIn(stdin);

            System.out.println("testConvertToWord passed.");

        } catch (AssertionError e) {
            System.err.println("testConsoleInput failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("testConcoleInput failed with an unexpected exception: " + e.getMessage());
        }
    }
}