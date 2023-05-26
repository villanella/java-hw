package org.homework8.tests;
import java.util.Random;
import org.homework8.assertions.Assertions;
import org.homework8.game.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class DiceImplTest {
    @Test
    public void testRoll() {
        // Create a stub Random object
        Random randomStub = new Random() {
            @Override
            public int nextInt() {
                return 5;
            }
        };

        // Create an instance of DiceImpl
        Dice dice = new DiceImpl();

        // Set the stub Random object as the internal random field of DiceImpl using reflection
       // setInternalRandom(dice, randomStub);

        // Call the roll method and assert the result
        int result = dice.roll();
        Assertions.assertEquals(5, result);
    }

}
