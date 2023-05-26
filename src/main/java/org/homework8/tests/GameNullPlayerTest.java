package org.homework8.tests;

import org.homework8.game.*;
import org.homework8.assertions.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GameNullPlayerTest {
    @DisplayName("Тест на игрока null")
    @Test
    public void runGameNullPlayerTest() {
        try {
            // Create a Game object with the actual Dice implementation
            Game game = new Game(new DiceImpl(), new GameWinnerConsolePrinter());

            // Redirect System.out to capture the printed output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);

            // Call the playGame method with a null player
            game.playGame(new Player("Вася"), null);

            // Retrieve the captured output
            String output = outputStream.toString().trim();

            // Reset System.out to its original value
            System.setOut(System.out);


            // Assert the expected output
            Assertions.assertEquals("Ошибка: Игрок не может быть null!", output);
            System.out.println("GameNullPlayerTest passed.");

        } catch (NullPointerException e) {
            System.err.printf("GameNullPlayerTest failed with null player: " + e.getMessage()) ;
        } catch (AssertionError e) {
            System.err.printf("GameNullPlayerTest failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.printf("GameNullPlayerTest failed: " + e.getMessage());
        }
    }
}
