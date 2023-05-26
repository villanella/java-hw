package org.homework8.tests;

import org.homework8.assertions.Assertions;
import java.util.Random;
import org.homework8.assertions.Assertions;
import org.homework8.game.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.homework8.assertions.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceImplRepeatsTest {
    @DisplayName("Тест на случайность значений")
    @Test
    public void testDiceImplRepeats() {
        try {

            Dice dice = new DiceImpl();
            int result1 = dice.roll();
            int result2 = dice.roll();
            int result3 = dice.roll();
            assertTrue(result1 != result2 || result1 != result3 || result2 != result3,
                    "\nGenerated values should not be equal: " + result1 + ", " + result2 + ", " + result3);

            System.out.printf("DiceImplRepeatsTest passed.");

        } catch (AssertionError e) {
            System.err.printf("DiceImplRepeatsTest failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.printf("DiceImplRepeats failed: " + e.getMessage());
        }
    }
}