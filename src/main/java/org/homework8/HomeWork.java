package org.homework8;
import org.homework8.game.*;
import org.homework8.tests.*;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {

        runGameTest();
        runGameTestWithTie();
        runNullPlayerTest();
    }


    private static void runGameTest() {
        System.out.println("Running GameTest...");
        try {
            GameTest.main(null);
            System.out.println("GameTest passed.");
        } catch (AssertionError e) {
            System.err.println("GameTest failed: " + e.getMessage());
        }
        System.out.println();
    }
    private static void runGameTestWithTie() {
        System.out.println("Running GameTestWithTie...");
        try {
            GameTestWithTie.main(null);
            System.err.println("GameTestWithTie failed: Expected output 'It's a tie!'");
        } catch (AssertionError e) {
            System.err.println("GameTestWithTie passed");
        }
        System.out.println();
    }

    private static void runNullPlayerTest() {
        System.out.println("Running NullPlayerTest...");
        try {
            NullPlayerTest.main(null);
            System.err.println("NullPlayerTest failed: Expected NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("NullPlayerTest passed.");
        } catch (Exception e) {
            System.err.println("NullPlayerTest failed: " + e.getMessage());
        }
        System.out.println();
    }

}


