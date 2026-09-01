package utils;

import java.util.Random;

public final class InputGenerator {
    private InputGenerator() {
    }

    public static int[] randomArray(int size, int bound, long seed) {
        Random random = new Random(seed);
        int[] values = new int[size];
        for (int index = 0; index < size; index++) {
            values[index] = random.nextInt(bound);
        }
        return values;
    }
}
