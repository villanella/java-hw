package org.homework8.tests;

import org.homework8.game.*;
public class GameTest {
    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);

        // Test with fixed roll results for player 1 and player 2
        int player1Result = 6;
        int player2Result = 4;
        game.playGame(new Player("Игорь"), new Player("Вася"));

        // Expected output: "Победитель: Игорь"
        // If the output is different, the test fails
    }
}
