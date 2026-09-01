package utils;

import java.util.Arrays;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void swap(int[] values, int first, int second) {
        int temporary = values[first];
        values[first] = values[second];
        values[second] = temporary;
    }

    public static boolean isSorted(int[] values) {
        for (int index = 1; index < values.length; index++) {
            if (values[index - 1] > values[index]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] values) {
        return Arrays.copyOf(values, values.length);
    }
}
