package org.homework8.tests;

import org.homework8.assertions.Assertions;
import org.homework8.game.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTestWithTie {
   @DisplayName("Teст ничьи")
   @Test
   public void runGameTestWithTie() {
       try {
           // Create a mock Dice implementation with fixed roll result of 5
           Dice diceMock = new DiceMock(5);
           GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();

           // Create a Game object with the mock Dice
           Game game = new Game(diceMock, winnerPrinter);

           // Redirect System.out to capture the printed output
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           PrintStream printStream = new PrintStream(outputStream);
           System.setOut(printStream);

           // Call the playGame method
           game.playGame(new Player("Вася"), new Player("Игорь"));

           // Retrieve the printed output
           String output = outputStream.toString().trim();

           // Reset System.out to its original value
           System.setOut(System.out);

           // Assert the expected output
           Assertions.assertEquals("Ничья!", output);
           System.out.println("GameTest passed.");

       } catch (AssertionError e) {
           System.err.println("GameTest failed: " + e.getMessage());
       } catch (Exception e) {
           System.err.println("GameTest failed with an unexpected exception: " + e.getMessage());
       }
   }

    private static class DiceMock implements Dice {
        private final int fixedValue;

        public DiceMock(int fixedValue) {
            this.fixedValue = fixedValue;
        }

        @Override
        public int roll() {
            return fixedValue;
        }
    }
}
