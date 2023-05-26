package org.homework8.tests;

import org.homework8.game.*;


public class GameNullPlayerTest {
    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);

        Player player1 = new Player("Игорь");
        Player player2 = new Player("Вася");
       // Player player2 = null;

        System.err.println("Test 3:");
        System.out.println("Expected output: NullPointerException");

        // Test the playGame method with a null player
        game.playGame(player1, player2);
    }
}
