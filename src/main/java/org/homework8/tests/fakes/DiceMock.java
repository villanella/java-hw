package org.homework8.tests.fakes;

import org.homework8.game.Dice;
public class DiceMock implements Dice {
    private final int fixedValue;

    public DiceMock(int fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Override
    public int roll() {
        return fixedValue;
    }
}
