package Java.utils;

import java.util.Random;

public class DiceRoller {
    private static final int NUMBER_OF_DICE = 3;
    private static final int NUMBER_OF_SIDES = 6;
    private static final Random random = new Random();

    public static int rollDice() {
        int total = 0;
        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            total += random.nextInt(NUMBER_OF_SIDES) + 1;
        }
        return total;
    }
}
