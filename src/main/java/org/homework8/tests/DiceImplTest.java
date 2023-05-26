package org.homework8.tests;
import org.homework8.assertions.Assertions;
import org.homework8.game.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DiceImplTest {
    @DisplayName("Тест на генерацию случайного числа в диапазоне (1, 6)")
    @Test
    public void testRollInRange() {

        try {

            Dice dice = new DiceImpl();

            // Roll the dice multiple times and check if the generated value is within the range
            for (int i = 0; i < 10; i++) {
                int result = dice.roll();
                Assertions.assertTrue(result >= 1 && result <= 6,
                        "\n Generated value should be in the range (1, 6), but got: " + result);


            }
            System.out.printf("DiceImplTest passed.");

        } catch (AssertionError e) {
            System.err.printf("\nDiceImplTest failed: Generated value should be in the range (1, 6). " + e.getMessage());

        } catch (Exception e) {
            System.err.printf("DiceImplTest failed: " + e.getMessage());
        }
    }

}
