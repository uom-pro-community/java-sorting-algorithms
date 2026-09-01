import utils.ArrayUtils;

public class BubbleSort {
    public static void sort(int[] values) {
        for (int end = values.length - 1; end > 0; end--) {
            for (int index = 0; index < end; index++) {
                if (values[index] > values[index + 1]) {
                    ArrayUtils.swap(values, index, index + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 4, 2, 8 };
        sort(values);
        System.out.println(java.util.Arrays.toString(values));
    }
}
