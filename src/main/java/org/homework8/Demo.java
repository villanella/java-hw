package org.homework8;

import org.homework8.game.*;

public class Demo {

    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
//        game.playGame(new Player("Вася"), new Player("Игорь"));

        game.playGame(new Player("Вася"), null);
    }
}