import utils.ArrayUtils;

public class BubbleSortOptimized {
    public static void sort(int[] values) {
        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int index = 0; index < end; index++) {
                if (values[index] > values[index + 1]) {
                    ArrayUtils.swap(values, index, index + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
