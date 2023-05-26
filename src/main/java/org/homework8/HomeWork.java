package org.homework8;
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

//         Need to correct: it's required set fixed values from DiceMock.
//        new GameTest().runGameTest();
//        System.out.println("\n\n----------------------\n\n");

        new DiceImplRepeatsTest().testDiceImplRepeats();
        System.out.println("\n\n----------------------\n\n");

        new GameTestWithTie().runGameTestWithTie();
        System.out.println("\n\n----------------------\n\n");

        new GameNullPlayerTest().runGameNullPlayerTest();
        System.out.println("\n\n----------------------\n\n");

        new DiceImplTest().testRollInRange();
        System.out.println("\n\n----------------------\n\n");
        }




}


