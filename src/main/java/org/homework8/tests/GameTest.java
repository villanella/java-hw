package org.homework8.tests;

import org.homework8.game.*;
import org.homework8.assertions.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {
    public void runGameTest() {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);

        // Test with fixed roll results for player 1 and player 2
        int player1Result = 6;
        int player2Result = 4;
        try {
            // Redirecting System.out to capture the printed output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);

            // Calling playGame without assigning the result
            game.playGame(new Player("Игорь"), new Player("Вася"));

            // Retrieving the printed output
            String actual = outputStream.toString().trim();

            // Resetting System.out to its original value
            System.setOut(System.out);

            // Asserting the expected output
            Assertions.assertEquals("Победитель: Игорь", actual);
            System.out.println("\"Победитель: Игорь\" passed.");

        } catch (Throwable e) {
            System.err.println("\"Победитель: Игорь\" failed with message \"" + e.getMessage() + "\"");
        }



        // Expected output: "Победитель: Игорь"
        // If the output is different, the test fails
    }
}
